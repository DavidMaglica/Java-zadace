/**
 * This is the Question which accepts only short answer.
 * A short answer is one word.
 *
 * @author David
 * @version 1.0
 *
 */
public class ShortAnswerQuestion {
    /**
     * Text of the question.
     */
    private String text;

    /**
     * Correct answer to the question.
     */
    private String correctAnswer;

    /**
     * Setting the text of the question
     * Setting the correct answer to the question
     */
    public ShortAnswerQuestion(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Method used to return the text in Main
     */
    public String getText() {
        return text;
    }

    /**
     * Checks if answer correct ignoring casing and returns True/False
     */
    public boolean isCorrectAnswer (String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}

