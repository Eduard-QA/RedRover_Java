package Lessons.Lessons_10;

public class Cooking {
    public static void main(String[] args) {
        Ingredient potatoes = new SolidIngredient("potatoes", 1.5);
        Ingredient milk = new LiquidIngredient("milk", 100);
        Bottle cognac = new Bottle("cognac");

        Ingredient[] allIngredient = {potatoes, milk, cognac};
        for (Ingredient ingredient : allIngredient) {
            System.out.println(ingredient.howToMeasure()
                    + ingredient.getDescription());
        }
    }

}


