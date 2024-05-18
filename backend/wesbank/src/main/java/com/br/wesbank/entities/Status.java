package com.br.wesbank.entities;

import com.br.wesbank.entities.enums.StatusEnum;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "tb_status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    private LocalDateTime dateTime;

    // Construtor
    public Status() {}

    public Status(StatusEnum statusEnum, LocalDateTime dateTime) {
        this.statusEnum = statusEnum;
        this.dateTime = dateTime;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", statusEnum=" + statusEnum +
                ", dateTime=" + dateTime +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Status status = (Status) obj;
        return Objects.equals(id, status.id);
    }
}
