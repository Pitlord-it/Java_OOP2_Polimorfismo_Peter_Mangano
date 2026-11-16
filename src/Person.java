public abstract class Person {
    public String name;
    public String surname;
    public String email;
    public int age;

    public Person(String name, String surname, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    
    
public abstract void displayInfo();
}
