package com.example.Cine.services;

import com.example.Cine.entities.SalaVIP;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.SalaVIPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaVIPServiceImpl extends BaseServiceImpl<SalaVIP, Long> implements SalaVIPService {

    @Autowired
    private SalaVIPRepository salaVIPRepository;

    public SalaVIPServiceImpl(BaseRepository<SalaVIP, Long> baseRepository) {
        super(baseRepository);
    }
}

