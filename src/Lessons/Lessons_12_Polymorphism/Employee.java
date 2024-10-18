package Lessons.Lessons_12_Polymorphism;

public abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double getSalary();

    public static class Worker extends Employee {

        public Worker(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double getSalary() {
            return baseSalary;
        }
    }

    public static class Manager extends Employee {
        int noOfSubordinates;

        public Manager(String name, double baseSalary, int noOfSubordinates) {
            super(name, baseSalary);
            this.noOfSubordinates = noOfSubordinates;
        }

        @Override
        double getSalary() {
            return baseSalary + noOfSubordinates + 0.05 * baseSalary;
        }
    }


}
