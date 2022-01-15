package io.github.andersev7en.ClientesApplication.model.rest.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    private String descricao;
    private String preco;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String data;
    private Integer idCliente;
}
