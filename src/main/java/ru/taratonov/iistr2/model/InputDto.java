package ru.taratonov.iistr2.model;

import lombok.Data;

import java.util.List;

@Data
public class InputDto {
    private List<Flower> flowers;
    private Vase vase;
}
