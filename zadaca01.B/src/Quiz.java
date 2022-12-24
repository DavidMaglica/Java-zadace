public class Quiz {
    /**
     * Postavljamo pitanje i dajemo "hardkodirane" odgovore
     */
    public static void main(String[] args) {
        ShortAnswerQuestion question = new ShortAnswerQuestion(
                "U kojem jeziku se programira za Android?", "Java"
        );
        System.out.println(question.getText());

        System.out.println("C: " + question.isCorrectAnswer("C"));
        System.out.println("Java: " + question.isCorrectAnswer("Java"));
    }
}