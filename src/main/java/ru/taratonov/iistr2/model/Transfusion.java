package ru.taratonov.iistr2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transfusion {
    private BloodType donorBloodType;
    private BloodType recipientBloodType;
}
