package com.example.Cine.controllers;

import com.example.Cine.entities.Compras;
import com.example.Cine.services.ComprasServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/compras")
public class ComprasController extends BaseControllerImpl<Compras, ComprasServiceImpl> {
}
