import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // 1. Convert the string to uppercase
        String upperCaseString = inputString.toUpperCase();
        System.out.println("\nString in uppercase: " + upperCaseString);

        // 2. Find the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // 3. Replace a character with another
        System.out.print("\nEnter the character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);
        String replacedString = inputString.replace(oldChar, newChar);
        System.out.println("String after replacing '" + oldChar + "' with '" + newChar + "': " + replacedString);

        // 4. Extract a substring
        System.out.print("\nEnter the starting index for the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int endIndex = scanner.nextInt();

        // Check for valid indices
        if (startIndex >= 0 && endIndex <= inputString.length() && startIndex < endIndex) {
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Extracted substring: " + substring);
        } else {
            System.out.println("Invalid indices for substring.");
        }

        scanner.close();
    }
}

