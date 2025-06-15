package com.example.Cine.services;

import com.example.Cine.entities.Pelicula;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Long> implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    public PeliculaServiceImpl(BaseRepository<Pelicula, Long> baseRepository) {
        super(baseRepository);
    }
}

