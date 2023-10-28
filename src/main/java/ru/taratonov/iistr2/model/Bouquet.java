package ru.taratonov.iistr2.model;

import lombok.Data;

import java.util.List;

@Data
public class Bouquet {
    private List<Flower> flowers;
    private Vase vase;
    private Boolean isThereAccentFlower = false;
}
