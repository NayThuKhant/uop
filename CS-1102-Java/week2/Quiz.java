package archives;

import javax.swing.*;

public class Quiz {

    public static void main(String[] args) {
        String question = "What's your age of the world?\n";

        question += "A. 2.543 billion years\n";
        question += "B. 3.543 billion years\n";
        question += "C. 4.543 billion years\n";
        question += "D. 5.543 billion years\n";
        question += "E. 6.543 billion years\n";

        String answer;

        while (true) {
            answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("C")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                return;
            } else if (answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }

    }
}
