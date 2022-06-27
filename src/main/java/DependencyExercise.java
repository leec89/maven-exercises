import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyExercise {

    public static void main(String[] args) {

        // setup do-while loop
        boolean again = true;
        do {

            // User input of something
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter something: ");
            String someThing = scanner.next();
            System.out.println();

            // Checks to see in the input (someThing) is a number
            if (StringUtils.isNumeric(someThing)) {
                System.out.println("You entered " + someThing + " and it is a number.");
                System.out.println();
            } else {
                System.out.println("You entered " + someThing + " and it is NOT a number.");
                System.out.println();

                // Flips the case of the input string using the SwapCase method
                System.out.println("The flipped case of the entered string is " + StringUtils.swapCase(someThing) + ".");
                System.out.println();

                // Reverses the input string using the reverse method
                System.out.println("The reverse of the entered string is " + StringUtils.reverse(someThing) + ".");
                System.out.println();

            }
            System.out.print("Do you want to go again(Y/n)?: ");
            String askUserToGoAgain = scanner.next().toLowerCase();
            System.out.println();
            if (!askUserToGoAgain.equals("y")) {
                again = false;
                System.out.println("Thanks for your time.");
            }
        } while (again);

    }

}
