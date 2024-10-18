package Lessons.Lessons_12_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Outer.NestedClass nest = new Outer.NestedClass();
        System.out.println(nest.getStaticInt());

        Outer o1 = new Outer(30);
        Outer.InnerClass inner1 = o1.new InnerClass();
        System.out.println(inner1.getInstanceInt() + inner1.getStaticInt());

        Employee w = new Employee.Worker("John", 5000.0);
        Employee m = new Employee.Manager("Max", 5000.0, 30);

        Employee an = new Employee("Peter", 60.0) {
            @Override
            double getSalary() {
                return baseSalary * 100;
            }
        };

        System.out.println(w.getSalary());
        System.out.println(m.getSalary());
        System.out.println(an.getSalary());


    }
}
