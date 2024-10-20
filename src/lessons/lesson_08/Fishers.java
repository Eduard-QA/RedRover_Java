package lessons.lesson_08;

public class Fishers {

    public static void main(String[] args) {

        Catch[] allCatches = {
                makeCatch("John", "Sturgeon", 20, false),
                makeCatch("Bob", "Salmon", 15, false),
                makeCatch("Peter", "Salmon", 17, true)
        };
        printArray(allCatches);
        System.out.println(totalWeight("Salmon", allCatches));
        System.out.println(totalWeight("Sturgeon", allCatches));
        System.out.println(totalWeight("Trout", allCatches));

        MinMaxCatch records = getMinMaxCatch(allCatches);
        System.out.println(records.maxCatch.makeString());
        System.out.println(records.minCatch.makeString());

    }

    static void printArray(Catch[] arr) {
        for (Catch c : arr) {
            System.out.println(c.makeString());
        }
    }

    static double totalWeight(String fishKind, Catch[] catches) {
        double totalWeight = 0;
        for (Catch c : catches) {
            if (c.fishKind.equals(fishKind))
                totalWeight += c.weight;
        }
        return totalWeight;
    }

    static MinMaxCatch getMinMaxCatch(Catch[] catches) {

        MinMaxCatch result = new MinMaxCatch();
        for (Catch element : catches) {
            if (result.maxCatch == null || element.weight > result.maxCatch.weight) {
                result.maxCatch = element;
            }
            if (result.minCatch == null || element.weight < result.minCatch.weight) {
                result.minCatch = element;
            }
        }
        return result;

    }

    static Catch makeCatch(String fisher, String fishKind, double weight, boolean released) {
        Catch c = new Catch();
        c.fisher = fisher;
        c.fishKind = fishKind;
        c.weight = weight;
        c.released = released;
        return c;
    }
}
