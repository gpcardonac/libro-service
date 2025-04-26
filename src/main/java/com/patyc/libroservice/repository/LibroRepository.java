
package com.patyc.libroservice.repository;

import com.patyc.libroservice.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LibroRepository extends JpaRepository<Libro, UUID> {
}
