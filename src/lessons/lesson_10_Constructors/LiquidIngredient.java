package lessons.lesson_10_Constructors;

public class LiquidIngredient extends Ingredient {
    public LiquidIngredient(String name, double volumeInMl) {
        super(name, volumeInMl + " ml");
    }

    @Override
    public String howToMeasure() {
        return "pour into a cap ";
    }
}
