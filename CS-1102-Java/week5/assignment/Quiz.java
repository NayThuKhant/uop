public class Quiz {
    public static void main(String[] args) {


        Question var1 = new MultipleChoiceQuestion("Area of The United States", "9.834 million km²", "9.833 million km²", "9.832 million km²", "9.831 million km²", "9.830 million km²", "A");
        var1.check();
        var1 = new MultipleChoiceQuestion("What's your age of the world?", "2.543 billion years", "3.543 billion years", "4.543 billion years", "5.543 billion years", "6.543 billion years", "C");
        var1.check();
        var1 = new MultipleChoiceQuestion("What's the total number of English Letters?", "22", "23", "24", "25", "26", "E");
        var1.check();
        var1 = new MultipleChoiceQuestion("Where does the sun rise from?", "The North", "The East", "The South", "The West", "Nowhere", "B");
        var1.check();
        var1 = new MultipleChoiceQuestion("When was WW2 ended?", "September 2, 1945", "September 2, 1946", "September 2, 1947", "September 2, 1948", "September 2, 1949", "A");
        var1.check();

        Question trueFalseQuestion = new TrueFalseQuestion("Area of the United States is 9.834 million km2", "TRUE");
        trueFalseQuestion.check();

        trueFalseQuestion = new TrueFalseQuestion("The age of the world is 4.543 billion years", "TRUE");
        trueFalseQuestion.check();

        trueFalseQuestion = new TrueFalseQuestion("The total number of the English Letters is 26", "TRUE");
        trueFalseQuestion.check();

        trueFalseQuestion = new TrueFalseQuestion("The sun rises from the West", "FALSE");
        trueFalseQuestion.check();

        trueFalseQuestion = new TrueFalseQuestion("WW2 is still happening", "FALSE");
        trueFalseQuestion.check();

        trueFalseQuestion.showResults();
    }
}
