public class Doctor extends Person {
    public int salary;
    public String licenseNumber;

    public Doctor(String name, String surname, String email, int age, int salary, String licenseNumber) {
        super(name, surname, email, age);
        this.salary = salary;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nDoctor Information:");
        System.out.println("Name: " + name + " " + surname + "  Email: " + email + "\nAge: " + age + "  Salary: " + salary + " euros " + "  License Number: " + licenseNumber);
        
    }

}
