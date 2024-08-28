package HomeWork;

public class HW_2_1 {
    public static void main(String[] arg) {
        System.out.println(pirateTest(10, 1085));
        System.out.println(checkPirateTest(10, 1085));

    }

    public static String pirateTest(int pirate, double many) {

        double partOfShipOwner = many / 2;
        double partOfCapitan = partOfShipOwner / 2;
        double partOfPirate = partOfCapitan / pirate;

        return "\tЧасть добычи владельца судна равняется " + partOfShipOwner + " пиастров" +
                "\n\tЧасть добычи капитана равняется " + partOfCapitan + " пиастров" +
                "\n\tЧасть добычи пирата равняется " + partOfPirate + " пиастров" +
                "\n\tА если капитан владелец судна то ему полагается " + (partOfShipOwner + partOfCapitan) + " пиастров";
    }

    public static boolean checkPirateTest(int pirate, double many) {

        double partOfShipOwner = many / 2;
        double partOfCapitan = partOfShipOwner / 2;
        double partOfPirate = partOfCapitan / pirate;

        return (partOfShipOwner + partOfCapitan + partOfPirate * pirate) == many;
    }
}

