import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        // System.out.println(.Arrays);
        Player[] players = new Player[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        // System.out.println("What is the names?");
        // String name = scanner.next();
        // System.out.println("Players: " + name);
        System.out.println("Amount of Players: " + people);
        scanner.close();

        Dealer dealer = new Dealer(people);
        dealer.showDeck();
        Deck deck = new Deck();

    }
}