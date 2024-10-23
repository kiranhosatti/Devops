import java.util.Scanner;

public class Wishes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Generate wishes
        generateWishes(name);
        
        // Close the scanner
        scanner.close();
    }

    public static void generateWishes(String name) {
        String[] wishes = {
            "Happy Birthday, " + name + "!",
            "Wishing you a joyful day, " + name + "!",
            "May your dreams come true, " + name + "!",
            "Have a wonderful year ahead, " + name + "!",
            "Sending you positive vibes, " + name + "!"
        };

        System.out.println("\nHere are your wishes:");
        for (String wish : wishes) {
            System.out.println(wish);
        }
    }
}
