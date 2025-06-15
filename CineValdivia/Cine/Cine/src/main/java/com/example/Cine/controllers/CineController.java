package com.example.Cine.controllers;

import com.example.Cine.entities.Cine;
import com.example.Cine.services.CineServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/cines")
public class CineController extends BaseControllerImpl<Cine, CineServiceImpl> {
}

