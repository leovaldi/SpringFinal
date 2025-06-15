package com.example.Cine.controllers;

import com.example.Cine.entities.Venta;
import com.example.Cine.services.VentaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ventas")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {
}
