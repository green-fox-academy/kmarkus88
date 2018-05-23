public class Dog {

    String breed;
    String name;
    int age;
    //azert hoztuk letre mert az uj konstruktor felulirta a regit de most csinalunk egu ujat tehat ujra letezik
    public Dog(){

    }

    //itt csak a breedjet adom mega tobbit nem ismerem
    public Dog(String breed) {
        this.breed = breed;
        this.name = "Morzsi";
        this.age = -1;

    }

    //Konstruktor (hogy ne kelljen kulon kulon kutyakat letrehozni | publicnak kell lenni)
    public Dog(String name, String breed, int age) {
        //a this. akkkor kell ha egy az ertekek neve mint itt
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

}
