package com.example.Cine.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empleados")
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Base {

    private String nombre;
    private int dni;

    @ManyToMany(mappedBy = "empleados", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Cine> cines = new ArrayList<>();

}
