import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author David Maglica
 */

public class Main {
    /**
     * Napisati program koji će s tipkovnice učitavati String-ov sve dok se ne učita String “kraj”.
     * Nakon što su svi String-ovi učitani, program mora ispisati samo String ove koji imaju jednak
     * broj suglasnika i samoglasnika.
     * @param args Typed in words
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<String> inputList = new ArrayList<>();

        // While petljom unosimo String-ove sve dok se ne upiše "kraj"/"Kraj"
        while (!input.equalsIgnoreCase("kraj")) {
            System.out.println("Upisite riječ: ");
            input = sc.next();
            inputList.add(input);
        }

        // ovom For petljom prolazimo kroz array unesenih rijeci
        for (String ls : inputList) {
            int v = 0;      // vowels
            int c = 0;      // consonants

            // For petlja za brojanje suglasnika i samoglasnika u unesenim rijecima
            for (int i = 0; i < ls.length(); i++) {
                char letter = ls.charAt(i);
                if (letter == 'a' || letter == 'e' || letter == 'o' ||
                    letter == 'i' || letter == 'u') ++v;
                else ++c;
            }

            // ako neka rijec ima isti broj samoglasnika i suglasnika ispisujemo tu rijec
            if (v == c) System.out.println(ls);
        }
    }
}