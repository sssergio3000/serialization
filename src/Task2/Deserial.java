package Task2;

import java.io.*;

public class Deserial {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 10);
        Cat cat1 = new Cat("Tim", "grey", 12);


        File file = new File("D:\\downloads\\cbs\\projects\\serialization\\src\\Task2\\test.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(cat);
            oos.writeObject(cat1);

            Cat catD = (Cat) ois.readObject();
            Cat cat1D = (Cat) ois.readObject();
            System.out.println(catD);
            System.out.println(cat1D);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        ;

    }
}
