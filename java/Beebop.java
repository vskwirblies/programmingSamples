import java.util.Scanner;

public class Beebop {

    /**
     * Prints the numbers from 0 to limit. Replaces certain numbers with 'bee', 'bop' and 'beebop' while doing so.
     */
    private static void printBeebop(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("beebop");
            else if (i % 5 == 0) System.out.println("bop");
            else if (i % 3 == 0) System.out.println("bee");
            else System.out.println(i);
        }
    }

    /**
     * Main-Method (Entrypoint for the program).
     */
    public static void main(String[] args) {
        System.out.println("Please type an end for counting:");
        Scanner in = new Scanner(System.in);    // Creating a Scanner-object in order to read user-input.
        boolean validNumberGiven = false;
        int inputAsInt = -1;
        while(!validNumberGiven) {
            String userinput = in.nextLine();
            try {
                inputAsInt = Integer.parseInt(userinput);
                if (inputAsInt >= 0) {
                    validNumberGiven = true;
                    System.out.println("Valid number detected: " + inputAsInt);
                }
                else System.out.println("Please give a valid number.");
            } catch(NumberFormatException e) {
                System.out.println("Please give a valid number.");
            }
        }
        printBeebop(inputAsInt);
    }
}