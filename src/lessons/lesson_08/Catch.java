package lessons.lesson_08;

public class Catch {
    String fisher;
    String fishKind;
    double weight;
    boolean released;

    public String makeString(){
        return "Fisher: " + fisher + " "
                + "Kind: " + fishKind + " "
                + "Weight: " + weight + " "
                + "Released? " + released;
    }
}
