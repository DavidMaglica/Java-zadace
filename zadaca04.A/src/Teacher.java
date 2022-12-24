public class Teacher extends Person {
    private String subjectName[] = new String[30];
    private int salary;

    // Konstruktor profesora
    public Teacher(String name, String surname, String[] subjectName, int salary) {
        super(name, surname);
        this.salary = salary;
        System.arraycopy(subjectName, 0, this.subjectName, 0, subjectName.length);
    }

    // Getteri i Setteri
    public String[] getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String[] subjectName) {
        this.subjectName = subjectName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Nadjačana metoda ispisa detalja tako da ispisuje podatke profesora
    @Override
    public void displayDetails() {
        System.out.println("\nProfesor: " + getName() + " " + getSurname() + "\nSalary: " + getSalary()
        + "\nSubjects: ");
        for (int x = 0;
             subjectName[x] != null && x < subjectName.length;
             x++) {
            System.out.println("\t" + subjectName[x]);
        }
    }
}
