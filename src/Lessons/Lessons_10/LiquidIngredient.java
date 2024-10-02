package Lessons.Lessons_10;

public class LiquidIngredient extends Ingredient {
    public LiquidIngredient(String name, double volumeInMl) {
        super(name, volumeInMl + " ml");
    }

    @Override
    public String howToMeasure() {
        return "pour into a cap ";
    }
}
