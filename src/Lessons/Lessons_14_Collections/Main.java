package Lessons.Lessons_14_Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] str = new String[5]; // массив содержащий 5 элементов
        List<String> strings = new ArrayList<>();  // List => самостоятельный класс
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add("dd");
        strings.add("ee");
        strings.add("ff");

        System.out.println(strings);
        System.out.println(strings.size());  // получить размер
        System.out.println(strings.get(5));  // получить по индексу отсчет с нуля

        strings.add(3, "ggg"); // добавить элемент на позицию индекс 3 (отсчет с нуля)
        System.out.println(strings);

        strings.remove(1); // удаление элемента по индексу
        System.out.println(strings);


    }
}
