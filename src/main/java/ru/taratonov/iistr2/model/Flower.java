package ru.taratonov.iistr2.model;

import lombok.Data;
import ru.taratonov.iistr2.model.enums.Color;
import ru.taratonov.iistr2.model.enums.FlowerName;
import ru.taratonov.iistr2.model.enums.Type;

@Data
public class Flower {
    private FlowerName name;
    private Color color;
    private Double stemSize;
    private Type type;
}
