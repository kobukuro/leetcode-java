public class GoalParserInterpretation1678 {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(new GoalParserInterpretation1678().interpret(command)); // Goal
    }
}
