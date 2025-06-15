package com.example.Cine.services;

import com.example.Cine.entities.ClienteVIP;
import com.example.Cine.repositories.BaseRepository;
import com.example.Cine.repositories.ClienteVIPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteVIPServiceImpl extends BaseServiceImpl<ClienteVIP, Long> implements ClienteVIPService {

    @Autowired
    private ClienteVIPRepository clienteVIPRepository;

    public ClienteVIPServiceImpl(BaseRepository<ClienteVIP, Long> baseRepository) {
        super(baseRepository);
    }
}
