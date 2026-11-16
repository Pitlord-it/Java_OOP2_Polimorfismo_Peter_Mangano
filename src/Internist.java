public class Internist extends Doctor {
    public String drug;

    public Internist(String name, String surname, String email, int age, int salary, String licenseNumber, String drug) {
        super(name, surname, email, age, salary, licenseNumber);
        this.drug = drug;
    }

    public void infoDrug() {
        System.out.println("\nThe Internist " + name + " " + surname + " recommends the use of " + drug + ".");
        
    }

    public void getSalary() {
        System.out.println("The salary of the Internist " + name + " " + surname + " is " + salary + " euros.");
    }
}
