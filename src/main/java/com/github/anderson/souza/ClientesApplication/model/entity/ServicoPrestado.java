package com.github.anderson.souza.ClientesApplication.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class ServicoPrestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 155)
    private String descricao;

    @ManyToOne // MUITOS SERVIÇOS PARA UM CLIENTE.
    @JoinColumn(name = "id_cliente") // DEFINE UMA CHAVE ESTRANGEIRA, SERVIÇO VAI TER UMA FK PARA CLIENTE
    private Cliente cliente;

    @Column
    private BigDecimal valorServico;

    @Column
    private LocalDate data;

}
