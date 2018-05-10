public class Cuboid {
    public static void main(String[] args) {

        double width = 10;
        double length = 4;
        double height = 5;
        // 2wl + 2lh + 2hw
        System.out.println("Volume: " + width * length * height );
        System.out.println("Surface Area: " + 2 * (width * length + length * height + height * width) );

    }
}
