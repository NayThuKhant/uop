import javax.swing.*;

class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {
        String[] questions = {
                "What's your age of the world?\n A. 2.543 billion years\n B. 3.543 billion years\n C. 4.543 billion years\n D. 5.543 billion years\n E. 6.543 billion years\n",
                "What's the total number of English Letters? \n A. 22 \n B. 23 \n C. 24 \n D.25 \n E.26",
                "Where does the sun rise from? \n A. The North \n B. The East \n C. The South \n D. The West \nE. Nowhere"
        };

        String[] answers = {"C", "E", "B"};

        int numberOfQuestions = questions.length;

        for (int index = 0; index < numberOfQuestions; index++) {
            check(questions[index], answers[index]);
        }

        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
    }

    public static String ask(String question) {
        String answer;

        while (true) {
            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }

    public static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);

        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }
}
