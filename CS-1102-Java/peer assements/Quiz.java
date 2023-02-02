import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String question = "What is syntax?\n";
        question += "A. a system that takes taxes.\n";
        question += "B. rules that control the structure of the symbols, punctuation, and words of a programming language.\n";
        question += "C. cinematic video which is posted in the internet.\n";
        question += "D. a sequence or set of instructions in a programming language for a computer to execute.\n";
        question += "E. a word with no meaning.\n";
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("B")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equals("A") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }

    }
}
