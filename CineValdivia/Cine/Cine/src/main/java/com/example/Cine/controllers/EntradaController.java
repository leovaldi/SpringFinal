package com.example.Cine.controllers;

import com.example.Cine.entities.Entrada;
import com.example.Cine.services.EntradaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/entradas")
public class EntradaController extends BaseControllerImpl<Entrada, EntradaServiceImpl> {
}

