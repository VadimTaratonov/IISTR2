package ru.taratonov.iistr2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Error {
    private String errorMessage;
    private LocalDateTime errorTime;
}
