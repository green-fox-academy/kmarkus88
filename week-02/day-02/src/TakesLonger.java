public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        //quote = quote.substring(0,quote.indexOf("you")) + "always takes longer than " + quote.substring(quote.indexOf("you"));
        //System.out.println(quote);

        String insertion = "always takes longer than ";
        String quote1 = quote.substring(0, 21);
        String quote2 = quote.substring(21);

        quote = quote1.concat(insertion.concat(quote2));

       // System.out.println(quote1);
        //System.out.println(quote2);
        System.out.println(quote);
    }
}
