public class Restaurant {

    private String name;
    private Dish[] dishes;
    private Drink[] drinks;

    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    // Metodo per stampare il menu
    public void stampaMenu() {

        System.out.println("Ristorante " + name);

        System.out.println("\nPIATTI");

        for (Dish dish : this.dishes) {
            System.out.println(dish.getName() + " - " + dish.getPrice() + " euro");
        }

        System.out.println("\nBEVANDE");

        for (Drink drink : this.drinks) {
            System.out.println(drink.getName() + " - " + drink.getPrice() + " euro");
        }
    }

    // metodo che stampa gli ingredienti di un piatto specifico, lanciando un il metodo della classe Dish getIngredients()
    public void dishIngredients(String name) {
        for (Dish dish : this.dishes) {
            if (dish.getName().equalsIgnoreCase(name)) {
                System.out.println("Gli ingredienti del piatto " + name + " sono: " + dish.getIngredients() + ".");
                return;
            }
        }
        System.out.println("Piatto non trovato");
    }

    
    

}



