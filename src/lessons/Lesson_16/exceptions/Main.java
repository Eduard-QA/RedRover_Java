package lessons.Lesson_16.exceptions;

public class Main {


    public static void main(String[] args) {

        try {
            String longestWord = findLongest(new String[]{"aa", "bbb", "dddd", "ff", "gggggg"});
            System.out.println("longest word: " + longestWord);
        } catch (ArrayTooShortException e) {
            System.out.println("You didn't send enough words.");
        } catch (ArrayTooLongException e) {
            System.out.println("You sent too many words.");
        }
        System.out.println("Continue the execution");

    }

    public static String findLongest(String[] words) {

        assertNotEmpty(words);
        String longest = "";
        for (String word : words) {
            if (longest.length() < word.length()) {
                longest = word;
            }
        }
        return longest;
    }

    private static void assertNotEmpty(String[] words) {
        if (words == null || words.length == 0) {
            throw new ArrayTooShortException();
        } else if (words.length > 5) {
            throw new ArrayTooLongException();
        }
    }
}
