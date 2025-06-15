package com.example.Cine.controllers;

import com.example.Cine.entities.Sala;
import com.example.Cine.services.SalaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/salas")
public class SalaController extends BaseControllerImpl<Sala, SalaServiceImpl> {
}
