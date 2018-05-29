public class Person {

  public String name;
  public int age;
  public  String gender;

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce(String name, int age , String gender) {
    System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender);
  }
  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
