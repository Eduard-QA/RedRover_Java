package lessons.lesson_14_Collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args){

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(1);
        intSet.add(3);
        intSet.add(1);
        intSet.add(4);
        intSet.add(1);
        intSet.add(3);
        System.out.println(intSet);
        // new HashSet<>()  => позволяет получить уникальные элементы (удаляет дубликаты)
    }
}
