package com.api.chat.chatroom.exception;

// status da requisição
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// se não achar o status da requisição
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    // vai descrever a mensagem que irá aparecer na exception
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
