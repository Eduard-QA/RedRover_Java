package lessons.lesson_14_Collections;

import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {
    Random random = new Random();
    private final int limit;
    private int counter;

    public RandomIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return counter<limit;
    }

    @Override
    public Integer next() {
        counter++;
        return random.nextInt();
    }

}
