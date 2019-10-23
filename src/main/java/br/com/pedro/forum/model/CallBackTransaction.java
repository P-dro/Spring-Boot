package br.com.pedro.forum.model;

import java.time.LocalDateTime;

public class CallBackTransaction {

    private Long value;
    private LocalDateTime creationDate;
    private LocalDateTime scheduleDate;

    public double getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDateTime scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
}
