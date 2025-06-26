import java.util.Scanner;

public class whatisyourname {
    public static void main(String[] args){
    // Create the scanner from the input
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user for his/her name
            System.out.print("What is your name? ");
        
            // Wait for the input and store it in the variable name
            String name = scanner.next();
        
            // Say hello to the user
            System.out.println("Hello, " + name + "!");
        }
    }
}
