package ru.taratonov.iistr2.exception;

import java.util.List;

public class IllegalArgumentOfEnumException extends RuntimeException {
    private final List<String> values;

    public static IllegalArgumentOfEnumException createWith(List<String> values) {
        return new IllegalArgumentOfEnumException(values);
    }

    private IllegalArgumentOfEnumException(List<String> values) {
        this.values = values;
    }

    private String makeMessage(List<String> values) {
        return String.join(" ",
                "Illegal argument, must be one of:", String.join(", ", values));
    }

    @Override
    public String getMessage() {
        return makeMessage(values);
    }
}
