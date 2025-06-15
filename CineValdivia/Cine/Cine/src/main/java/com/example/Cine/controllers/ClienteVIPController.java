package com.example.Cine.controllers;

import com.example.Cine.entities.ClienteVIP;
import com.example.Cine.services.ClienteVIPServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clientesvip")
public class ClienteVIPController extends BaseControllerImpl<ClienteVIP, ClienteVIPServiceImpl> {
}
