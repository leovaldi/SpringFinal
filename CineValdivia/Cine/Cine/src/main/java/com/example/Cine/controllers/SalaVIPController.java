package com.example.Cine.controllers;

import com.example.Cine.entities.SalaVIP;
import com.example.Cine.services.SalaVIPServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/salas-vip")
public class SalaVIPController extends BaseControllerImpl<SalaVIP, SalaVIPServiceImpl> {
}

