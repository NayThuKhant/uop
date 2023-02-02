import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = answer.toUpperCase();
    }


    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            boolean isValidAsTrue = (answer.equals("t") || answer.equals("true") || answer.equals("T") || answer.equals("True") || answer.equals("TRUE")
                    || answer.equals("y") || answer.equals("yes") || answer.equals("Y") || answer.equals("Yes") || answer.equals("YES"));

            boolean isValidAsFalse = (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE")
                    || answer.equals("n") || answer.equals("no") || answer.equals("No") || answer.equals("NO"));

            boolean valid = isValidAsTrue || isValidAsFalse;

            if (valid) return isValidAsTrue ? "TRUE" : "FALSE";

            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
        }
    }

}
