package com.github.anderson.souza.ClientesApplication.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, name = "login")
    @NotEmpty(message = "O campo login é obrigatório.")
    private String username;

    @Column(name = "senha")
    @NotEmpty(message = "O campo senha é obrigatório.")
    private String password;
}
