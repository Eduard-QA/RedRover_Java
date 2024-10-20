package lessons.Lesson_16.exceptions;

public class ArrayTooShortException extends RuntimeException {
    public ArrayTooShortException() {
        super("Array is too short");
    }
}
