package ru.taratonov.iistr2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import ru.taratonov.iistr2.exception.IllegalArgumentOfEnumException;

import java.util.Arrays;
import java.util.stream.Collectors;

@Getter
public enum ProductName {
    POTATO("potato"),
    CABBAGE("cabbage"),
    CARROT("carrot"),
    CUCUMBER("cucumber"),
    TOMATO("tomato"),
    BEET("beet"),
    MELON("melon"),
    WATERMELON("watermelon"),
    ONION("onion");

    @JsonCreator
    static ProductName findValue(String findValue) {
        return Arrays.stream(ProductName.values())
                .filter(value -> value.name().equalsIgnoreCase(findValue))
                .findFirst()
                .orElseThrow(() -> IllegalArgumentOfEnumException.createWith(
                        Arrays.stream(ProductName.values())
                                .map(ProductName::getTitle)
                                .collect(Collectors.toList())));
    }

    private final String title;

    ProductName(String title) {
        this.title = title;
    }
}
