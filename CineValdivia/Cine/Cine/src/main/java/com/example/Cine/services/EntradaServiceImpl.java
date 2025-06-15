package com.example.Cine.services;

import com.example.Cine.entities.Entrada;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaServiceImpl extends BaseServiceImpl<Entrada, Long> implements EntradaService {

    @Autowired
    private EntradaRepository entradaRepository;

    public EntradaServiceImpl(BaseRepository<Entrada, Long> baseRepository) {
        super(baseRepository);
    }
}

