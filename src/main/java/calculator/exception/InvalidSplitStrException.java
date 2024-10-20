package calculator.exception;

public class InvalidSplitStrException extends RuntimeException {
    public InvalidSplitStrException(String splitStr) {
        super(splitStr + "는 유효하지 않은 잘린 문자열입니다.");
    }
}
