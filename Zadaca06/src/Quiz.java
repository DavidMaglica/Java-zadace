public class Quiz {
    private String name;
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[10];
    private int noOfQuestions = 0;
    private final int MAX_NO_OF_QUESTIONS = 10; // maksimalan broj pitanja postavljamo na 10

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
        if (noOfQuestions == MAX_NO_OF_QUESTIONS) {
            throw new IllegalStateException("Dosegli ste maksimalan broj pitanja.");
        }
        if (noOfQuestions < MAX_NO_OF_QUESTIONS) {
            questions[noOfQuestions] = new ShortAnswerQuestion(text, answer);
            noOfQuestions++;
        } else {
            System.out.println("Dosegli ste maksimalan broj pitanja.");
        }
    }
    // Agregacija = klasa Quiz ima samo reference na eksterne objekte question
    public void addQuestion (ShortAnswerQuestion question) {
        if (noOfQuestions < MAX_NO_OF_QUESTIONS) {
            questions[noOfQuestions] = question;
            noOfQuestions++;
        }
    }

    public int getNoOfQuestions () {
        return noOfQuestions;
    }

    public int getMAX_NO_OF_QUESTIONS () { return  MAX_NO_OF_QUESTIONS; }

    public String getQuestion (int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer (int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }
}
