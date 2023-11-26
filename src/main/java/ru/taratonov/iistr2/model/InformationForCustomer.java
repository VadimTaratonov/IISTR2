package ru.taratonov.iistr2.model;

import lombok.Data;

@Data
public class InformationForCustomer {
    private ProductName productName;
    private Integer currentAmountOfNitrates;
    private Integer acceptableAmountOfNitrates;
    private Answer answer;
}
