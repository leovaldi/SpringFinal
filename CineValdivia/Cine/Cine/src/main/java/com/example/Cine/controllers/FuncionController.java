package com.example.Cine.controllers;

import com.example.Cine.entities.Funcion;
import com.example.Cine.services.FuncionServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/funciones")
public class FuncionController extends BaseControllerImpl<Funcion, FuncionServiceImpl> {
}

