package io.github.andersev7en.ClientesApplication.model.rest.exceptions;

public class UsuarioCadastradoException extends RuntimeException{
    public UsuarioCadastradoException(String login) {
        super("Usuário já cadastrado para login: " + login);
    }
}
