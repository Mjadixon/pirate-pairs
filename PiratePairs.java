import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        // System.out.println(.Arrays);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        System.out.println("What is the names?");
        String names = scanner.nextLine();
        System.out.println("Players: " + names);
        System.out.println("Amount of Players: " + people);
        scanner.close();
        System.out.println("hello wghfghfuorld");

        Dealer dealer = new Dealer();
        dealer.showDeck();

    }
}