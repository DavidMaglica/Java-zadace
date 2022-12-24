import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author David Maglica
 */

public class Main {
    /**
     * Preinačiti Primjer 2.3 na način da je moguć unos podataka studentima putem tipkovnice
     * Kada korisnik više ne želi unositi podatke omogućiti mu ispis svih zapisa studenata.
     * Također ponuditi mu i mogućnosti izlaza iz programa.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newStudent = "da"; String newGrade = "da";

        ArrayList<Student> students = new ArrayList<Student>();
        while (newStudent.equalsIgnoreCase("da")) {
            Student student = new Student();
            student.init();

            System.out.println("Zelite li dodati novog studenta (da/ne)?");
            newStudent = sc.next();
            if (newStudent.equalsIgnoreCase("ne")) {
                break;
            }
            else {
                System.out.println("Ime: "); student.setName(sc.next());
                System.out.println("Prezime: "); student.setSurname(sc.next());
                System.out.println("Id: "); student.setId(sc.next());
            }

            while (newGrade.equalsIgnoreCase("da")) {
                System.out.println("\nUpis novog kolegija(da/ne)?");
                newGrade = sc.next();
                if (newGrade.equalsIgnoreCase("ne")) {
                    newGrade = "da"; // ova linija omogućava dodavanje predmeta i drugim studentima a ne samo prvom
                    break;
                }
                else {
                    System.out.println("Kod kolegija: "); int code = sc.nextInt();
                    System.out.println("Naziv kolegija: "); String title = sc.next();
                    System.out.println("Zavrsna ocjena: "); int grade = sc.nextInt();
                    student.addGrade(code, title, grade);
                }
            }
            students.add(student);
        }

        System.out.println("\nZelite li ispisati sve studente (da/ne)?");
        String printOut = sc.next();
        if (printOut.equalsIgnoreCase("da")) {
            for (int i = 0; i < students.size(); i++) {
                int brojac = i+1;
                System.out.println("\n-----\nStudent br." + brojac);
                System.out.println("ID: " + students.get(i).getId());
                System.out.println("Ime: " + students.get(i).getName());
                System.out.println("Prezime: " + students.get(i).getSurname());
                System.out.println("Upisani predmeti:"); students.getClass();
                System.out.println("Prosjek ocjena: " + students.get(i).averageGrade());
            }
        }
    }
}