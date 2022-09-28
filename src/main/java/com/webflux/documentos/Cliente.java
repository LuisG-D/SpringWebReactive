package com.webflux.documentos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private String id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotNull
    private Integer edad;
    @NotNull
    private Double sueldo;

    private String foto;

}
