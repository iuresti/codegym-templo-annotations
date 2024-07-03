package com.codegym.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private int generacion;
}
