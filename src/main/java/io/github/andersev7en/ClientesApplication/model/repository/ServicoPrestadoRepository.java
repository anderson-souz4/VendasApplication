package io.github.andersev7en.ClientesApplication.model.repository;

import io.github.andersev7en.ClientesApplication.model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {
}
