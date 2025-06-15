package com.example.Cine.controllers;

import com.example.Cine.entities.Pelicula;
import com.example.Cine.services.PeliculaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/peliculas")
public class PeliculaController extends BaseControllerImpl<Pelicula, PeliculaServiceImpl> {
}

