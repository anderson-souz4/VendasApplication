package com.github.anderson.souza.ClientesApplication.model.rest;

import com.github.anderson.souza.ClientesApplication.model.entity.Cliente;
import com.github.anderson.souza.ClientesApplication.model.entity.ServicoPrestado;
import com.github.anderson.souza.ClientesApplication.model.repository.ClienteRepository;
import com.github.anderson.souza.ClientesApplication.model.repository.ServicoPrestadoRepository;
import com.github.anderson.souza.ClientesApplication.model.rest.dto.ServicoPrestadoDTO;
import com.github.anderson.souza.ClientesApplication.util.BigDecimalConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/servicos-prestados")

@RequiredArgsConstructor
public class ServicoPrestadoController {

        private final ClienteRepository clienteRepository;
        private final ServicoPrestadoRepository repository;
        private final BigDecimalConverter bigDecimalConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ServicoPrestado salvar (@RequestBody @Valid ServicoPrestadoDTO dto){
        LocalDate data = LocalDate.parse(dto.getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Integer idCliente = dto.getIdCliente();

        Cliente cliente =
                clienteRepository
                        .findById(idCliente)
                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cliente inexistente"))
                ;

        ServicoPrestado servicoPrestado = new ServicoPrestado();
        servicoPrestado.setDescricao(dto.getDescricao());
        servicoPrestado.setData(data);
        servicoPrestado.setCliente(cliente);
        servicoPrestado.setValorServico( bigDecimalConverter.converter(dto.getPreco()) );
        
        return repository.save(servicoPrestado);
    }
}
