import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        Players[] players = new Players[people];

        System.out.println("How many players do you want?");

        // System.out.println("What is the names?");
        // String name = scanner.next();
        // System.out.println("Players: " + name);
        System.out.println("Amount of Players: " + people);

        Dealer dealer = new Dealer(people);
        dealer.showDeck();
        Deck deck = new Deck();
        scanner.close();
    }
}