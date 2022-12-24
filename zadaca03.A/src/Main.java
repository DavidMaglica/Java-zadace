import java.util.Scanner;

/**
 * @author David Maglica
 */

public class Main {
    /**
     * Uz dva već postavljena pitanja, korisnik može nadodati do 8 pitanja. (Max 10 pitanja)
     * Svako pitanje ima i svoj točan odgovor kojeg korisnik upisuje.
     * Na kraju korisnik odgovara na pitanja i dobiva rezultate kviza.
     * @param args Command Line arguments
     */
    public static void main (String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion("U kojem jeziku se programira za Android?", "Java");
        quiz.addQuestion("U kojem jeziku se programira za iOS?", "Objective-C");

        Scanner sc = new Scanner(System.in);

        // Ubacivanje custom pitanja
        String input;   // u ovu varijablu ubacujemo podatak ako korisnik zeli stvoriti pitanje ili ne
        String q;       // question
        String a;       // answer

        System.out.println("Želite li dodati pitanje (da/ne)?");
        input = sc.nextLine();

        while (input.equalsIgnoreCase("da") && quiz.getNoOfQuestions() < 10) {
            System.out.println("Unesite vaše pitanje: ");
            q = sc.nextLine();
            System.out.println("Unesite točan odgovor na vaše pitanje: ");
            a = sc.nextLine();
            ShortAnswerQuestion newQuestion = new ShortAnswerQuestion(q, a);
            // quiz.addQuestion(q, a);          // Kompozicija
            quiz.addQuestion(newQuestion);      // Agregacija

            if (quiz.getNoOfQuestions() < 10) {
                System.out.println("\nŽelite li dodati još jedno pitanje (da/ne)?");
                input = sc.nextLine();
            } else System.out.println("\nDosegli ste maksimalan broj pitanja (10 pitanja).");
        }

        int noOfCorrectAnswers = 0;
        for (int i = 0; i < quiz.getNoOfQuestions(); i++) {
            System.out.println("\n" + quiz.getQuestion(i) + "?");
            String answer = sc.nextLine();
            if (quiz.isCorrectAnswer(i, answer)) {
                noOfCorrectAnswers++;
                System.out.println("Točno.");
            } else {
                System.out.println("Netočno.");
            }
        }

        double totalq = quiz.getNoOfQuestions();
        double percentage = noOfCorrectAnswers / totalq * 100;
        System.out.println("\n---\nImali ste " + noOfCorrectAnswers + " točnih odgovora od ukupno "
                + quiz.getNoOfQuestions() + ". -> " + percentage + "%");
    }
}
