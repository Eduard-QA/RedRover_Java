package codewars;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {

        System.out.println(abbrevName("sam harris"));
        System.out.println(bestAbbrevName("Jack Rich"));
        System.out.println(disemVowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(maskify("123456789"));
        System.out.println(highAndLow("1 2 3 4 -5 67 89"));
    }

    public static String abbrevName(String name) {
        String str = name;
        String[] strArr = str.split(" ");
        StringBuilder abbrev = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            char firstLetter = Character.toUpperCase(strArr[i].charAt(0));
            abbrev.append(firstLetter);
            if (i < strArr.length - 1) {
                abbrev.append('.');
            }
        }
        return abbrev.toString();
    }

    public static String bestAbbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    public static String highAndLow(String numbers) {
        int[] numbersInt = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : numbersInt) {
            if (max < num) {
                max = num;
            }
        }
        for (int num : numbersInt) {
            if (min > num) {
                min = num;
            }
        }
        return max + " " + min;
    }

    public static String disemVowel(String str) {
        StringBuilder consonants = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                consonants.append(ch);
            }
        }
        return consonants.toString();
    }

    public static String bestDisemVowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 4) {
            for (int i = 0; i < sb.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
            return sb.toString();
        } else return sb.toString();
    }
}




