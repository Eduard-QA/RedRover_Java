package lessons.Lesson_16.exceptions;

public class ArrayTooLongException extends RuntimeException {
    public ArrayTooLongException() {
        super("Array is too long! Can't handle!");
    }
}
