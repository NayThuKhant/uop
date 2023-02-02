public class Quiz {
    public static void main(String[] args) {
        Question question = new TrueFalseQuestion("Quizzes are fun !", "y");
        question.check();
        question = new TrueFalseQuestion("Quizzes are more fun than programming !", "n");
        question.check();
        question = new TrueFalseQuestion("Which one starts with T ? ", "t");
        question.check();
        question = new TrueFalseQuestion("Which one starts with F ? ", "f");
        question.check();
        question = new TrueFalseQuestion("Which one is not true ? ", "false");
        question.check();


        question = new MultipleChoiceQuestion(
                "What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");
        question.check();
        question = new MultipleChoiceQuestion("When is a quiz?",
                "long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore",

                "b");
        question.check();
        question = new MultipleChoiceQuestion("Where is a quiz?",
                "a galaxy far, far away",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain",
                "c");
        question.check();
        question = new MultipleChoiceQuestion("Why is a quiz?",
                "I think, therefore it is.",
                "Who is to say?",
                "You tell me.",
                "Because learning is fun!",
                "Because I said so.",
                "d");
        question.check();
        question = new MultipleChoiceQuestion("How is a quiz?",
                "fair to middling",
                "not bad",
                "by a stroke of luck",
                "by accident",
                "Using Java object-oriented programming!",
                "e");
        question.check();
        question.showResults();
    }
}
