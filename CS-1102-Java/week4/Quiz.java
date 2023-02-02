class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {

        MultipleChoiceQuestion question = new MultipleChoiceQuestion(
                "Area of The United States",
                "9.834 million km²",
                "9.833 million km²",
                "9.832 million km²",
                "9.831 million km²",
                "9.830 million km²",
                "A"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "What's your age of the world?",
                "2.543 billion years",
                "3.543 billion years",
                "4.543 billion years",
                "5.543 billion years",
                "6.543 billion years",
                "C"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "What's the total number of English Letters?",
                "22",
                "23",
                "24",
                "25",
                "26",
                "E"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "Where does the sun rise from?",
                "The North",
                "The East",
                "The South",
                "The West",
                "Nowhere",
                "B"
        );
        question.check();

        question = new MultipleChoiceQuestion(
                "When was WW2 ended?",
                "A. September 2, 1945",
                "B. September 2, 1946",
                "C. September 2, 1947",
                "D. September 2, 1948",
                "E. September 2, 1949",
                "A"
        );
        question.check();

        question.showResults();
    }
}
