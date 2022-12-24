public class Quiz {
    private String name;
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[10];
    private int noOfQuestions = 0;

    public Quiz () {
        name = "initial Quiz";
    }
    public Quiz (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    // Kompozicija = klasa Quiz interno sadrži objekte questions
    public void addQuestion (String text, String answer) {
        // TODO maksimalan broj pitanja - DONE
        if (noOfQuestions < 10) {
            questions[noOfQuestions] = new ShortAnswerQuestion(text, answer);
            noOfQuestions++;
        }
    }
    // Agregacija = klasa Quiz ima samo reference na eksterne objekte question
    public void addQuestion (ShortAnswerQuestion question) {
        // TODO maksimalan broj pitanja - DONE
        if (noOfQuestions < 10) {
            questions[noOfQuestions] = question;
            noOfQuestions++;
        }
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    public String getQuestion (int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer (int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }
}
