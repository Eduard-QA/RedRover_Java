package lessons.lesson_10_Constructors;

public class SolidIngredient extends Ingredient {
    public SolidIngredient(String name, double weightInKg) {
        super(name, weightInKg + " kg");
    }

    @Override
    public String howToMeasure() {
        return "weigh on a scale ";
    }
}
