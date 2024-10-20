package lessons;

import java.util.Arrays;

public class Lesson_5 {
    public static void main(String[] args) {
        referType();
        printVertical();
        stringMethods();
        changeString();
        countSymbol();
        countSymbolArr();
    }

    public static void referType() {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = arr1;

        arr2[1] = 10;
        System.out.println(Arrays.toString(arr1));
    }

    public static void stringMethods() {
        String str = "Hello world!";
        System.out.println("Длина строки = " + str.length());
        System.out.println("Индекс символа 'w' => " + str.indexOf("w"));
        System.out.println("Символ который находится по индексу 9 => " + str.charAt(9));
        System.out.println("Замена буквы на другой символ => " + str.replace("l", "-"));

    }

    //Создание новой строки путем изменения первой
    public static void changeString() {
        String str = "Hello world";
        String str2 = str.replaceFirst("Hello", "Good bay");
        System.out.println("Изменённый текст: " + str2);
    }

    // комбинация клавиш ctrl + Q  всплывает подсказка об методе "
    // Строка "string" обозначается двойными кавычками, Символ 'char' обозначается одинарными
    public static void printVertical() {
        String str = "Hello world";
        for (char st : str.toCharArray()) {
            System.out.println(st);
        }
    }

    // Подсчёт символов в строке
    public static void countSymbol() {
        String str = "Hello world";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("В строке присутствует " + count + " буквы 'l' ");
    }

    public static void countSymbolArr() {
        String[] arr = {"Hello", "world", "!"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'l') ;
            }
            count++;
        }
        System.out.println("В массиве строк присутствует " + count + " буквы 'l' ");
    }
}
