package Lessons.Lessons_12_Polymorphism;

public class Outer {
    static int staticInt = 10;
    int instanceInt;

    public Outer(int instanceInt) {
        this.instanceInt = instanceInt;
    }

    public static class NestedClass {
        public int getStaticInt() {
            return staticInt;
        }

    }

    public class InnerClass {
        public int getInstanceInt(){
            return instanceInt;
        }
        public int getStaticInt(){
            return staticInt;
        }

    }
}
