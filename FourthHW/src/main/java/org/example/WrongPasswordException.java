package org.example;

public class WrongPasswordException extends RuntimeException {
    private final int currentLength;
    private final boolean matchConfirm;

    public WrongPasswordException(int currentLength, boolean matchConfirm) {
        super();
        this.currentLength = currentLength;
        this.matchConfirm = matchConfirm;
    }

    @Override
    public String getMessage() {
        boolean badLen = currentLength < 20;
        return String.format("Ваш пароль имеет %s правильную длину %s %d." +
                        " Пароль %s соответствует подтверждению",
                ((badLen) ? "" : "не"),
                ((badLen) ? "-" : "(длина < 20 символов), введено "),
                currentLength,
                (matchConfirm) ? "" : "не");
    }
}
