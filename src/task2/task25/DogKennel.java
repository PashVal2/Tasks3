package task2.task25;
import java.util.ArrayList;

public class DogKennel { // тестирование класса собаки
    private final ArrayList<Dog> dogs = new ArrayList<>();

    public static void main(String [] args) {
        DogKennel kennel = new DogKennel();
        Dog Miatlik = new Dog("Miatlik", 5);
        Dog Kentafaric = new Dog("Kentafaric", 3);
        kennel.dogs.add(Miatlik);
        kennel.dogs.add(Kentafaric);
        System.out.println(Miatlik.getAge());
        System.out.println(Miatlik.humanAge());
        System.out.println(Kentafaric.getNick());
        Kentafaric.setAge(2);
        Kentafaric.setNick("Krouli");

        for (Dog dog : kennel.dogs) {
            System.out.println(dog.toString());
        }
    }
}
