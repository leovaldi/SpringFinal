package com.example.Cine.services;

import com.example.Cine.entities.Pago;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServiceImpl extends BaseServiceImpl<Pago, Long> implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public PagoServiceImpl(BaseRepository<Pago, Long> baseRepository) {
        super(baseRepository);
    }
}
