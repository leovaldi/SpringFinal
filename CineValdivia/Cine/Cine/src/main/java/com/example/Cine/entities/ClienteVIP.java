package com.example.Cine.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "clientes_vip")
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteVIP extends Cliente {

    private float descuento;

}

