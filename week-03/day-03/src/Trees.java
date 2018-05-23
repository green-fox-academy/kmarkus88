public class Trees {
    String type;
    String leafColor;
    int age;
    String sex;

    public Trees (String x, String y, int number, String sex) {
        type = x;
        leafColor = y;
        age = number;
        sex = sex;
    }

    public static void main(String[] args) {
        Trees fa1 = new Trees("bukk", "green", 4, "male");
        Trees fa2 = new Trees("tolgy", "green", 20, "male");
        Trees fa3 = new Trees("akac", "green", 3, "female");
        Trees fa4 = new Trees("fuz", "lightGreen", 22, "male");
        Trees fa5 = new Trees("fenyo", "darkGreen", 67, "female");
    }
}
