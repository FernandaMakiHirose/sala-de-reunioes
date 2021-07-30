package com.api.chat.chatroom.exception;

import java.util.Date;

// as exceptions são respostas tratadas dos erros

public class ErrorDetails {

    // data e hora
    private Date timestamp;

    // mensagem do erro
    private String message;

    private String details;

    // gera os getters
    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    // gera o construtor com os erros
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
