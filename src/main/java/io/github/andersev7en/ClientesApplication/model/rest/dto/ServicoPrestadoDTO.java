package io.github.andersev7en.ClientesApplication.model.rest.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    @NotEmpty(message = "Campo Descrição obrigatório")
    private String descricao;

    @NotEmpty(message = "Campo Preço obrigatório")
    private String preco;

    @NotEmpty(message = "Campo Data obrigatório")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String data;

    @NotNull(message = "Campo Cliente obrigatório")
    private Integer idCliente;
}
