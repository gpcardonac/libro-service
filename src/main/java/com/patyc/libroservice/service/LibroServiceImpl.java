package com.patyc.libroservice.service;

import com.patyc.libroservice.model.Libro;
import com.patyc.libroservice.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LibroServiceImpl implements LibroService {

    private final LibroRepository libroRepository;

    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public Libro crearLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro buscarLibroPorId(UUID id) {
        return libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado"));
    }

    public Libro asignarAutor(UUID id, String autor) {
        Libro libro = buscarLibroPorId(id);
        libro.setAutor(autor);
        return libroRepository.save(libro);
    }

}
