package com.example.Cine.controllers;

import com.example.Cine.entities.Pago;
import com.example.Cine.services.PagoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pagos")
public class PagoController extends BaseControllerImpl<Pago, PagoServiceImpl> {
}
