package io.github.andersev7en.ClientesApplication.model.repository;

import io.github.andersev7en.ClientesApplication.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
