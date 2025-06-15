package com.example.Cine.services;

import com.example.Cine.entities.Sala;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServiceImpl extends BaseServiceImpl<Sala, Long> implements SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public SalaServiceImpl(BaseRepository<Sala, Long> baseRepository) {
        super(baseRepository);
    }
}
