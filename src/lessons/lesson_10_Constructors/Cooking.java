package lessons.lesson_10_Constructors;

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
        add((SolidIngredient) potatoes);
        add(cognac);
    }

    public static void addIngredient(Ingredient ingredient) {
        System.out.println("Added " + ingredient.getDescription());
    }

    public static void add( SolidIngredient solid) {
        System.out.println("Cat " + solid.getDescription());
    }

    public static void add(LiquidIngredient liquid) {
        System.out.println("Poured " + liquid.getDescription());
    }
}


