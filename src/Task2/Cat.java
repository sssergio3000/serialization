package Task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    String color;
    int furLength;

    public Cat() {
    }

    public Cat(String name, String color, int furLength) {
        super(name);
        this.color = color;
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", furLenght=" + furLength + '}';
    }

    private void writeObject(ObjectOutputStream oos) {
        try {

            oos.defaultWriteObject();

            oos.writeObject(super.name);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {

            ois.defaultReadObject();

            this.name = (String) ois.readObject();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
