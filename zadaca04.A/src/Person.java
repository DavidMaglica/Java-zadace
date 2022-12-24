public class Person {
    private String name, surname;

    // Konstruktor osobe
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getteri i setteri za osobu
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Metoda za ispis detalja osobe
    public void displayDetails() {
        System.out.println("Name and surname: " + getName() + " " + getSurname());
    }
}
