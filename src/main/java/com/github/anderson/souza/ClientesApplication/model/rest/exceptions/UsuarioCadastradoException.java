package com.github.anderson.souza.ClientesApplication.model.rest.exceptions;

public class UsuarioCadastradoException extends RuntimeException{
    public UsuarioCadastradoException(String login) {
        super("Usuário já cadastrado para login: " + login);
    }
}
