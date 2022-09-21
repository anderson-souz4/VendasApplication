package com.github.anderson.souza.ClientesApplication.model.repository;

import com.github.anderson.souza.ClientesApplication.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
