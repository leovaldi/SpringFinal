package com.example.Cine.repositories;

import com.example.Cine.entities.Cine;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends BaseRepository<Cine, Long> {
}

