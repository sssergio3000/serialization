package Task2;

public class Animal {
    String name;

    public Animal() {
        System.out.println("Animal constr");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
