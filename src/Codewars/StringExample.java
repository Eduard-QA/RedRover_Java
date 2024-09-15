package Codewars;

public class StringExample {
    public static void main(String[] args) {

        System.out.println(abbrevName("sam harris"));
        System.out.println(bestAbbrevName("Jack Rich"));
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
        name = abbrev.toString();

        return name;
    }

    public static String bestAbbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    public static String highAndLow(String numbers) {
       /*
       highAndLow("1 2 3 4 5")  // return "5 1"
       highAndLow("1 2 -3 4 5") // return "5 -3"
       highAndLow("1 9 3 4 -5") // return "9 -5"
        */
        return "throw towel";
    }

}



