package ru.taratonov.iistr2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private ProductName productName;
    private Integer amountOfNitrates;
}
