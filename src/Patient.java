public class Patient extends Person {
    public String symptoms;
    public String illness;

    public Patient(String name, String surname, String email, int age, String symptoms, String illness) {
        super(name, surname, email, age);
        this.symptoms = symptoms;
        this.illness = illness;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nPatient Information:");
        System.out.println("Name: " + name + " " + surname + "  Email: " + email + "\nAge: " + age + "  Symptoms: " + symptoms + "  Illness: " + illness + "\n");
        
    }

}
