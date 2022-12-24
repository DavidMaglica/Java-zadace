public class ShortAnswerQuestion {
    private String text;
    private String correctanswer;

    // Konstruktor
    public ShortAnswerQuestion (String text, String correctanswer) {
        this.text = text;
        this.correctanswer = correctanswer;
    }

    public String getText () {
        return text;
    }

    public boolean isCorrectAnswer (String answer) {
        return correctanswer.equalsIgnoreCase(answer);
    }
}

