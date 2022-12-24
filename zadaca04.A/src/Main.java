/**
 * @author David Maglica
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kreiranje i ispis podataka o osobi
        Person person = new Person("David", "Maglica");
        person.displayDetails();

        // Kreiranje i ispis podataka o studentu
        String[] professors = new String[] {"Tanković", "Sovilj", "Brborović"};

        String[] studentSubjects = new String[] {"Dist Sys", "STP", "Matematička logika"};

        Student student = new Student("David", "Maglica", 1, studentSubjects, professors);
        student.displayDetails();

        // Kreiranje i ispis podataka o profesoru
        String[] professorSubjects = new String[] {"Robotika", "3D modeliranje"};
        Teacher teacher = new Teacher("Marko", "Markić", professorSubjects, 7500);
        teacher.displayDetails();

        // Scanner za primanje podataka sa tipkovnice
        Scanner sc = new Scanner(System.in);

        // question provjerava ako korisnik želi uopće upisati neke podatke
        String question;
        // input nam treba za korištenje ponuđenog menija
        int input = 0;

        System.out.println("\nŽelite li dodati još nekoga? (da/ne)");
        question = sc.next();

        while (question.equalsIgnoreCase("da")) {

            while (input == 0) {
                System.out.println("\nŽelite li dodati: " +
                        "\n\t1. Osobu" +
                        "\n\t2. Studenta" +
                        "\n\t3. Profesora" +
                        "\n\t9. Izlaz iz programa");
                input = sc.nextInt();
            }


            while (input == 1) {
                System.out.println("\n--- Odlučili ste dodati osobu ---\n");
                String name, surname;

                System.out.println("Ime: ");
                name = sc.next();
                System.out.println("Prezime: ");
                surname = sc.next();

                Person p = new Person(name, surname);
                System.out.println("- Uspjesno dodana osoba -");
                p.displayDetails();
                // input vraćamo na 0 kako bi nam se ponovo prikazao meni
                input = 0;
            }

            while (input == 2) {
                System.out.println("\n--- Odlučili ste dodati studenta ---\n");
                String name, surname;
                int id;
                String[] kolegiji = new String[5];
                String[] profesori = new String[5];
                int i;

                System.out.println("Ime: ");
                name = sc.next();
                System.out.println("Prezime: ");
                surname = sc.next();
                System.out.println("Id: ");
                id = sc.nextInt();

                System.out.println("Koliko kolegija sluša student? (Max. 5)");
                i = sc.nextInt();
                for (int counter = 0; counter < i; counter++) {
                    int x = counter + 1;
                    System.out.println("Kolegij br." + x);
                    kolegiji[counter] = sc.next();
                }

                System.out.println("Profesori (jedan za svaki predmet): ");
                for (int counter = 0; counter < i; counter++) {
                    int x = counter + 1;
                    System.out.println("Profesor iz kolegija " + kolegiji[counter] + " :");
                    profesori[counter] = sc.next();
                }

                Student s = new Student(name, surname, id, kolegiji, profesori);
                System.out.println("\n- Uspjesno dodan student -");
                s.displayDetails();
                // input vraćamo na 0 kako bi nam se ponovo prikazao meni
                input = 0;
            }

            while (input == 3) {
                System.out.println("\n--- Odlučili ste dodati profesora ---\n");
                String name, surname;
                int salary;
                String[] kolegiji = new String[5];
                int i;

                System.out.println("Ime: ");
                name = sc.next();
                System.out.println("Prezime: ");
                surname = sc.next();
                System.out.println("Plaća: ");
                salary = sc.nextInt();

                System.out.println("Koliko kolegija predaje profesor? (Max. 5)");
                i = sc.nextInt();
                for (int counter = 0; counter < i; counter++) {
                    int x = counter + 1;
                    System.out.println("Kolegij br." + x);
                    kolegiji[counter] = sc.next();
                }

                Teacher t = new Teacher(name, surname, kolegiji, salary);
                System.out.println("\n- Uspješno dodan profesor -");
                t.displayDetails();
                // input vraćamo na 0 kako bi nam se ponovo prikazao meni
                input = 0;
            }
            while (input == 9) {
                // Korisnik ne želi dodati nove podatke -> question = "ne" i break
                question = "ne";
                break;
            }
        }
    }
}