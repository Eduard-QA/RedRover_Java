package lessons.lesson_06_Classes;

public class LibMaine {
    public static void main(String[] args) {
        Book onegin = new Book();
        onegin.title = "Евгений Онегин";
        onegin.author = "А. С. Пушкин";
        onegin.language = "Russian";
        onegin.page = 800;

        Book ivanhoe = new Book();
        ivanhoe.title = "Ivanhoe";
        ivanhoe.author = "W. Scott";
        ivanhoe.language = "English";
        ivanhoe.page = 500;

        Book gore = Library.sozdatKnigu("Горе от ума", "Грибоедов", "русский");

        Library congress = new Library();
        congress.books = new Book[]{onegin, ivanhoe, gore};
        congress.printIndexCard();

    }
}
