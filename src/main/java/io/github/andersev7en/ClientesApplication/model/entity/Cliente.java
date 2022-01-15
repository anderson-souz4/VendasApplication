package io.github.andersev7en.ClientesApplication.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.ExtensionMethod;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera o ID a criterio do banco
    private Integer id;

    @Column(nullable = false, length = 150) // nullable é que não pode ficar nulo o campo, e lenght o cumpimento
    @NotEmpty(message = "Nome Obrigatório")
    private String nome;

    @Column(nullable = false, length = 11)
    @NotNull(message = "CPF Obrigatório")
    @CPF(message =  "CPF Inválido." )
    private String cpf;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    private void prePersist(){
        setDataCadastro(LocalDate.now());
    }
}
