package org.example;

public class WrongLoginException extends RuntimeException {
    private final int currentLength;

    public WrongLoginException(int currentLength) {
        super();
        this.currentLength = currentLength;
    }

    @Override
    public String getMessage() {
        return String.format("Длина вашего логина неверна (длина < 20 символов), введено %d.", currentLength);
    }
}
