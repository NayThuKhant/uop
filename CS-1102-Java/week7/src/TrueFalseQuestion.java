import javax.swing.*;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {
        super(question);

        JPanel buttons = new JPanel();

        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");

        this.question.add(buttons);
        initQuestionDialog();


        answer = answer.toUpperCase();
        if (answer.equals("T") || answer.equals("TRUE") ||
                answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
        if (answer.equals("F") || answer.equals("FALSE") ||
                answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
