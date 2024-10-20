package lessons.lesson_14_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionMap {

    public static void main(String[] args) {
        String string = "adsflj229349jjfoejrrrmfgoqejajfo238jmfa";
        List<Employee> employees = List.of(
                new Employee("John", "NY"),
                new Employee("Fredy", "LA"),
                new Employee("Bobbe", "Florida"),
                new Employee("Marry", "NY"),
                new Employee("Anna", "Indiana")
        );

        Map<String, List<Employee>> byOffice = groupByOffice(employees);
        System.out.println(byOffice);

        mapMethods();

        Map<Character, Integer> characterCount = countCharacter(string);
        System.out.println(characterCount);

        charWithMaxCount(countCharacter(string));


    }

    public static void mapMethods() {
        Map<String, Integer> employeeAges = new HashMap<>();
        employeeAges.put("Harry", 24);
        employeeAges.put("John", 34);
        employeeAges.put("Marry", 42);
        employeeAges.put("Steve", 54);
        employeeAges.put("Bobby", 46);

        System.out.println(employeeAges.get("John"));
        System.out.println(employeeAges);
        employeeAges.put("Marry", 18);
        System.out.println(employeeAges);
    }

    public static Map<Character, Integer> countCharacter(String string) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : string.toCharArray()) {
            int count;
            if (result.get(c) == null) {
                count = 1;
            } else {
                count = result.get(c) + 1;
            }
            result.put(c, count);
        }
        return result;
    }

    public static void charWithMaxCount(Map<Character, Integer> myMap) {
        int max = 0;
        char maxChar = ' ';
        for (char key : myMap.keySet()) {
            if (myMap.get(key) > max) {
                max = myMap.get(key);
                maxChar = key;
            }
        }
        System.out.println("Буква " + maxChar + "написанна " + max + " раз");
    }

    public static Map<String, List<Employee>> groupByOffice(List<Employee> employees) {
        Map<String, List<Employee>> byOffice = new HashMap<>();
        for (Employee employee : employees) {
            List<Employee> employeesInOffice = byOffice.getOrDefault(employee.getOffice(), new ArrayList<>());
            employeesInOffice.add(employee);
            byOffice.put(employee.getOffice(), employeesInOffice);
        }
        return byOffice;
    }

}
