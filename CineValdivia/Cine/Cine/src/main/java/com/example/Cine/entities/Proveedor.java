package com.example.Cine.entities;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "proveedores")
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor extends Base {

    private String nombre;
    private String telefono;
    private String direccion;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    @JoinColumn(name = "compras_id")
    private Compras compras;

}

