package com.example.Cine.services;

import com.example.Cine.entities.Cine;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.CineRepository;
import org.springframework.stereotype.Service;

@Service
public class CineServiceImpl extends BaseServiceImpl<Cine, Long> implements CineService {

    private final CineRepository cineRepository;

    public CineServiceImpl(CineRepository cineRepository) {
        super(cineRepository);
        this.cineRepository = cineRepository;
    }
}
