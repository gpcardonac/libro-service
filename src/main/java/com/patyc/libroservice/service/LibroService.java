package com.patyc.libroservice.service;

import com.patyc.libroservice.model.Libro;

import java.util.List;
import java.util.UUID;

public interface LibroService {
    Libro crearLibro(Libro libro);
    List<Libro> listarLibros();
    Libro buscarLibroPorId(UUID id);
    Libro asignarAutor(UUID id, String autor);

}
