package ru.taratonov.iistr2.model;

import lombok.Data;

@Data
public class Transfusion {
    private BloodType donorBloodType;
    private BloodType recipientBloodType;
}
