package com.example.Cine.entities;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "insumos")
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insumo extends Base {

    private String nombre;
    private double precio;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    @JoinColumn(name = "compra_id")
    private Compras compra;

}
