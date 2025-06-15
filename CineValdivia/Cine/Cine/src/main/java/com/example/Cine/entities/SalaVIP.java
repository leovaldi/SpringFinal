package com.example.Cine.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "salas_vip")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class SalaVIP extends Sala {

    private String beneficios;

}
