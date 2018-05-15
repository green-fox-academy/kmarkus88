public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        String insertion1 = "My todo\n";
        String insertion2 = " - Download games\n";
        String insertion3 = "\t - Diablo";



        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(insertion1.concat(todoText.concat(insertion2.concat(insertion3))));
    }
}
