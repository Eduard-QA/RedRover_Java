package Lessons.Lesson_06_Classes;

public class Library {
    static String indexCardHeader = "=====BOOK=====";
    Book[] books = null;

    static Book sozdatKnigu(String title, String author, String language) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.language = language;

        return book;
    }

    public void printIndexCard() {
        for (Book kniga : books) {
            System.out.println(indexCardHeader);
            System.out.println(kniga.makeCard());
        }
    }
}
