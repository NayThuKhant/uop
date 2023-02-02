public class Main {
    public static void main(String[] args) {
        AdditionProblem problem = new AdditionProblem();
        System.out.print(problem.getProblem() + "\n");

        int answer = Integer.parseInt(TextIO.getln());
        String output;

        if (answer ==  problem.getAnswer()) {
            output = "The answer is correct";
        } else {
            output = "The answer is incorrect and the correct answer is " + problem.getAnswer();
        }

        System.out.println(output);
    }
}
