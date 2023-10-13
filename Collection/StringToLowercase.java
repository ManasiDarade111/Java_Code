import java.util.Scanner;

public class StringToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String lowercaseString = input.toLowerCase();

        System.out.println("String in lowercase: " + lowercaseString);

        scanner.close();
    }
}
