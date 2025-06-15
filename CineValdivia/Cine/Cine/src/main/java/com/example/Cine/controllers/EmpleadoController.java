package com.example.Cine.controllers;

import com.example.Cine.entities.Empleado;
import com.example.Cine.services.EmpleadoServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/empleados")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl> {
}
