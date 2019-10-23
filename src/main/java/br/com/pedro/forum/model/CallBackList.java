package br.com.pedro.forum.model;

import java.time.LocalDateTime;

public class CallBackList {
    private LocalDateTime sourceDateTime = LocalDateTime.now();
    private String classification;
    private String type;
    private String status;

    public LocalDateTime getSourceDateTime() {
        return sourceDateTime;
    }

    public void setSourceDateTime(LocalDateTime sourceDateTime) {
        this.sourceDateTime = sourceDateTime;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
