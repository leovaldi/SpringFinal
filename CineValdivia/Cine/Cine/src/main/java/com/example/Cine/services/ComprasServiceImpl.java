package com.example.Cine.services;

import com.example.Cine.entities.Compras;
import com.example.Cine.repositories.ComprasRepository;
import org.springframework.stereotype.Service;

@Service
public class ComprasServiceImpl extends BaseServiceImpl<Compras, Long> implements ComprasService {

    private final ComprasRepository comprasRepository;

    public ComprasServiceImpl(ComprasRepository comprasRepository) {
        super(comprasRepository);
        this.comprasRepository = comprasRepository;
    }
}
