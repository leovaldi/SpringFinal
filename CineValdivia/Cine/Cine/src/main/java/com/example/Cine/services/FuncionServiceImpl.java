package com.example.Cine.services;

import com.example.Cine.entities.Funcion;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionServiceImpl extends BaseServiceImpl<Funcion, Long> implements FuncionService {

    @Autowired
    private FuncionRepository funcionRepository;

    public FuncionServiceImpl(BaseRepository<Funcion, Long> baseRepository) {
        super(baseRepository);
    }
}

