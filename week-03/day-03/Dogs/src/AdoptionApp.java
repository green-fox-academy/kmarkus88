public class AdoptionApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Retek";
        dog.breed = "Bulldog";
        dog.age = 2;
        Dog dog2 = new Dog("Csorika", "Yorki", 3);
        // Dog dog2 = new Dog();
        //dog2.name = "Csorika";
        Shelter shelter = new Shelter("Illatos ut");
        shelter.dogs.add(dog);
        shelter.dogs.add(dog2);

        Person person = new Person("Joe");

        System.out.println(dog2.name);

    }

}
