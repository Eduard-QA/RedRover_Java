package Lessons.Lessons_14_Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        listMethods(); // создание коллекции и основные методы
        mutable();    //new ArrayList<>(List.of("ww", "rr", "hh", "3")); => быстрое создание изменяемой коллекции
        immutable();  //выдаст ошибку потому что формат List.of создает неизменяемую коллекцию

    }

    public static void listMethods(){
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

    public static void immutable() {
        List<String> imm = List.of("aa", "dd", "xx", "gg");
        imm.add("ss");
        System.out.println(imm);
    }

    public static void mutable() {
        List<String> mmu = new ArrayList<>(List.of("ww", "rr", "hh", "3"));
        mmu.add(2, "55");
        System.out.println(mmu);
    }


}
