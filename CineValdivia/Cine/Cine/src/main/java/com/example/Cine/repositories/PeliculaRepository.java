package com.example.Cine.repositories;

import com.example.Cine.entities.Pelicula;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends BaseRepository<Pelicula, Long> {
}
