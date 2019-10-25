package br.com.original.sigla.projeto.domain.callback.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasicHttpErrorMessage {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public BasicHttpErrorMessage() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.setTimestamp(dtf.format(now));
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int responseCode) {
        this.status = responseCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}