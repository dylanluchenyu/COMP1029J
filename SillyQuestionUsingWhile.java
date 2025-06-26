/**
 * This program shows the use of a while loop in a silly question which forces
 * the user to answer 'Y'.
 */
import java.util.Scanner;

public class SillyQuestionUsingWhile
{
    /**
     * The main method of the program.
     */
    public static void main(String[] args)
    {
        // Show the question
        System.out.println("I am handsome. Do you agree?");
        System.out.print("Answer (Y/N): ");

        // Ask for the answer
        String answer;
        try (Scanner scanner = new Scanner(System.in)) {
            answer = scanner.next();

            // Ask the question if the answer is not 'Y'
            while (!answer.equals("Y")) {
                System.out.println("Can't hear you. Please answer again.");
                System.out.print("Answer (Y/N): ");
                answer = scanner.next();
            }
        }

        System.out.println("That's right!");
    }
}
