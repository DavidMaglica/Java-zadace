import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    String enrolledClasses[] = new String[30];
    String professorName[] = new String[30];
    
    // Konstruktor studenta
    public Student (String name, String surname, int studentId, String enrolledClasses[], String professorName[]) {
        super(name, surname);
        this.studentId = studentId;

        System.arraycopy(enrolledClasses, 0, this.enrolledClasses, 0, enrolledClasses.length);
        System.arraycopy(professorName, 0, this.professorName, 0, professorName.length);
    }

    // Getter i Setter za Id studenta
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Nadjačana metoda ispisa detalja tako da ispisuje podatke studenta
    @Override
    public void displayDetails() {
        System.out.println("\nIme i prezime studenta: " + getName() + " " + getSurname() + "\nID: " + getStudentId());

        for (int x = 0;
             enrolledClasses[x] != null && professorName[x] != null &&
             x < enrolledClasses.length && x < professorName.length;
             x++) {
            System.out.println("Upisani predmet: " + enrolledClasses[x] + "\tPrezime profesora: " + professorName[x]);
        }
    }
}
