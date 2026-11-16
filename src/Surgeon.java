public class Surgeon extends Doctor {
    public String surgery;
    public Surgeon(String name, String surname, String email, int age, int salary, String licenseNumber, String surgery) {
        super(name, surname, email, age, salary, licenseNumber);
        this.surgery = surgery;
    }

    public void infoSurgery() {
        System.out.println("\nThe Surgeon " + name + " " + surname + " is specialized in " + surgery + ".");
        
    }
    public void getSalary() {
        System.out.println("The salary of the Surgeon " + name + " " + surname + " is " + salary + " euros.\n");
    }

}


