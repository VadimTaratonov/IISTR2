package ru.taratonov.iistr2.controller;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.taratonov.iistr2.model.Error;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Error catchException(HttpMessageNotReadableException exception) {
        String[] split = exception.getMessage().split(":");
        return new Error(String.join(" ", split[split.length - 2], split[split.length - 1]), LocalDateTime.now());
    }
}
