package lessons.lesson_10_Constructors;

public abstract class Ingredient {
    private final String name;
    private final String amount;

    public Ingredient(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getDescription() {
        return amount + " of " + name;
    }

    public abstract String howToMeasure();
}


