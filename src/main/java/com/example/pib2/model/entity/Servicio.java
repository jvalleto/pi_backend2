package com.example.pib2.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String titulo;

    @NotBlank
    @Column(nullable = false)
    private String imagen;

    @NotBlank
    @Column(nullable = false)
    private String alt;

    // Si quieres texto largo en Postgres, puedes usar columnDefinition = "TEXT"
    // o dejar length si prefieres portabilidad.
    @NotBlank
    @Column(nullable = false, columnDefinition = "TEXT")
    // alternativa: @Column(nullable = false, length = 1000)
    private String descripcion;
}
