package ru.taratonov.iistr2.model;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private ProductName productName;
    @Min(value = 0, message = "can not be less than zero")
    private Integer amountOfNitrates;
}
