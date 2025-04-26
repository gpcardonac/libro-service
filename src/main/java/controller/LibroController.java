package com.patyc.libroservice.controller;

import com.patyc.libroservice.model.Libro;
import com.patyc.libroservice.service.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.listarLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable UUID id) {
        Libro libro = libroService.buscarLibroPorId(id);
        return ResponseEntity.ok(libro);
    }

    @PutMapping("/{id}/autor")
    public Libro asignarAutor(@PathVariable UUID id, @RequestBody Map<String, String> autorRequest) {
        String autor = autorRequest.get("autor");
        return libroService.asignarAutor(id, autor);
    }
}
