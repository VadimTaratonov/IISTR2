package ru.taratonov.iistr2.model;

import lombok.Data;
import ru.taratonov.iistr2.model.enums.Color;
import ru.taratonov.iistr2.model.enums.Material;

@Data
public class Vase {
    private Material material;
    private Color color;
    private Double height;
}
