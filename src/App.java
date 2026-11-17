public class App {
    public static void main(String[] args) throws Exception {

        // 1)Primo esercizio: Esercizio classe astratta Person, sottoclassi Doctor e Patient
        System.out.println("\n1) Esercizio della classe astratta Person, sottoclassi Doctor e Patient:");
        System.out.println("\nMedical Staff and Patients Information System");

        // creazione oggetti di classe Doctor e Patient, sottoclassi della classe astratta Person
        Doctor doctor = new Doctor("Adam", "Smith", "adam.smith@example.com", 40, 60000, "MGIT123456");
        Patient patient = new Patient("Jane", "Smith", "jane.smith@example.com", 35, "Fever, Cough", "Influenza");

        // visualizzazione informazioni
        doctor.displayInfo();
        patient.displayInfo();

        // creazione oggetti di classe Internist e Surgeon, sottoclassi della classe Doctor  
        Internist internist = new Internist("James", "Oliver", "james.oliver@example.com", 45, 70000, "ABC123", "Lidocaine");
        Surgeon surgeon = new Surgeon("Lily", "Johnson", "lily.johnson@example.com", 50, 80000, "XYZ789", "Cardiac Surgery");

        // visualizzazione informazioni
        
        internist.infoDrug();
        internist.getSalary();

        surgeon.infoSurgery();
        surgeon.getSalary();


        // 2)Secondo esercizio: esercizio del ristorante
        System.out.println("\n2) Esercizio del Ristorante:\n");

        // Creazione dei piatti (oggetti di classe Dish) e dell'array di oggetti Dish
        Dish pizza = new Dish("Margherita", 7.00, "Pomodoro, Mozzarella, Basilico");
        Dish pasta = new Dish("Carbonara", 12.00, "Pasta, Guanciale, Uova, Pecorino Romano");
        Dish carne = new Dish("Bistecca ai ferri", 15.00, "Manzo, Sale, Pepe");

        Dish[] dishes = {pizza, pasta, carne};

        // Creazione delle bevande (oggetti di classe Drink) e dell'array di oggetti Drink
        Drink acqua = new Drink("Acqua", 2.00);
        Drink cola = new Drink("Coca-Cola", 3.50);
        Drink caffe = new Drink("Caffe", 1.50);

        Drink[] drinks = {acqua, cola, caffe};

        // Creazione del ristorante (oggetto di classe Restaurant) e stampa del menù
        Restaurant restaurant = new Restaurant("La Vita è Bella", dishes, drinks);

        restaurant.stampaMenu();

        // Stampa degli ingredienti di un piatto specifico
        System.out.println("\nIngredienti dei piatti selezionati:");
        restaurant.dishIngredients("Carbonara");
        restaurant.dishIngredients("Margherita");
        System.out.println("\n");

    }
}
