package hw_7;

public class Main {
    public static void main(String[] args) {
        final String setOfBrackets = "[[]}{{}(])";
        final CheckingCorrectnessParenthesisSequence sequence = new CheckingCorrectnessParenthesisSequence();
        sequence.elementAnalysis(setOfBrackets);
        final String setOfBrackets2 = "({[[]]}())";
        sequence.elementAnalysis(setOfBrackets2);
    }
}
