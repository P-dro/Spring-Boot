package br.com.pedro.forum.model;

import java.time.LocalDateTime;

public class CallBackDetailTransaction {

    private String transaction;
    private String classification;
    private String channel;
    private String status;
    private LocalDateTime transacDateTime;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTransacDateTime() {
        return transacDateTime;
    }

    public void setTransacDateTime(LocalDateTime transacDateTime) {
        this.transacDateTime = transacDateTime;
    }
}
