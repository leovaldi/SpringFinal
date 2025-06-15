package com.example.Cine.controllers;

import com.example.Cine.entities.Cliente;
import com.example.Cine.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl> {
}

