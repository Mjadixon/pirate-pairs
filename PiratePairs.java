import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        // 5Players[] players = new Players[people];

        // System.out.println("What is the names?");
        // String name = scanner.next();
        // System.out.println("Players: " + name);
        System.out.println("Amount of Players: " + people);

        Dealer dealer = new Dealer(people);
        dealer.showDeck();
        dealer.shuffle();
        dealer.showDeck();
        int temp = dealer.drawCard();
        System.out.println(temp);
        dealer.showDeck();
        scanner.close();
    }
}