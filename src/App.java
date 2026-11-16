public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n1) Medical Staff and Patients Information System");

        // creazione oggetti Doctor e Patient
        Doctor doctor = new Doctor("Adam", "Smith", "adam.smith@example.com", 40, 60000, "MGIT123456");
        Patient patient = new Patient("Jane", "Smith", "jane.smith@example.com", 35, "Fever, Cough", "Influenza");

        // visualizzazione informazioni
        doctor.displayInfo();
        patient.displayInfo();

        // creazione oggetti Internist e Surgeon 
        Internist internist = new Internist("James", "Oliver", "james.oliver@example.com", 45, 70000, "ABC123", "Lidocaine");
        Surgeon surgeon = new Surgeon("Lily", "Johnson", "lily.johnson@example.com", 50, 80000, "XYZ789", "Cardiac Surgery");

        // visualizzazione informazioni
        
        internist.infoDrug();
        internist.getSalary();

        surgeon.infoSurgery();
        surgeon.getSalary();

    }
}
