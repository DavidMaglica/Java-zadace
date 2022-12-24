import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        // Kreiranje listi
        List<String> ls1 = new ArrayList<>();
        List<String> ls2 = new ArrayList<>();

        // Učitavamo datoteke
        FileReader inputStreamPrvi = new FileReader("src/prvi.txt");
        FileReader inputStreamDrugi = new FileReader("src/drugi.txt");

        // Prva datoteka
        BufferedReader entry = new BufferedReader(inputStreamPrvi);
        String line = null;
        System.out.println("Podaci iz prve datoteke: ");
        while ((line = entry.readLine()) != null) {
            System.out.println(line + " ");
            ls1.add(line);
        }

        // Druga datoteka
        entry = new BufferedReader(inputStreamDrugi);
        System.out.println("\nPodaci iz druge datoteke: ");
        while ((line = entry.readLine()) != null) {
            System.out.println(line + " ");
            ls2.add(line);
        }

        // Ispis svih imena koja se nalaze u prvoj datoteci, a nisu u drugoj datoteci
        printNotSame(ls1, ls2);
    }

    public static void printNotSame (List<String> ls1, List<String> ls2) {
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < ls1.size(); i++) {
            if (!ls2.contains(ls1.get(i))) {
                temp.add(ls1.get(i));
            }
        }
        Collections.sort(temp);
        System.out.println("\nImena koja se nalaze u prvoj a nisu u drugoj: ");
        for (int i = 0; i < temp.size(); i++) System.out.println(temp.get(i) + " ");
    }
}