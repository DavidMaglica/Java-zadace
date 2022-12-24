import java.util.Scanner;

/**
 * @author David Maglica
 */

public class Main {
    public static void main (String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion("U kojem jeziku se programira za Android?", "Java");
        quiz.addQuestion("U kojem jeziku se programira za iOS?", "Objective-C");

        Scanner sc = new Scanner(System.in);

        // Try and catch
        try {
            populateQuiz(quiz);
        } catch (Exception e) {
            System.out.println("Iznimka uhvaćena: " + e);
        }
        System.out.println("Kviz je spreman.");

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

        double totalQ = quiz.getNoOfQuestions();
        double percentage = noOfCorrectAnswers / totalQ * 100;
        int totalQInt = (int)totalQ;
        System.out.println("\n---\nImali ste " + noOfCorrectAnswers + " točnih odgovora od ukupno "
                + totalQInt + " pitanja. -> " + percentage + "%");
    }

    public static void populateQuiz (Quiz quiz) {
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
        };
    }
}
