import java.util.ArrayList;
import java.util.List;

public class Shelter {

    String name;
    List<Dog> dogs;

    public Shelter(String name) {
        this.name = name;
        dogs = new ArrayList<>();
    }

    public String adopt(Person person, Dog dog) {
        person.dog = dog;
        this.dogs.remove(dog);
        return dog.name;
    }

}
