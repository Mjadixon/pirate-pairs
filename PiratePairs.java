import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        // 5Players[] players = new Players[people];
        System.out.println("Amount of Players: " + people);
        // Sets new dealer 
        Dealer dealer = new Dealer(people);
        Player player = new Player(people);
        dealer.showDeck();
        dealer.shuffle();
        dealer.showDeck();
        System.out.println("Do you want to draw?");
        int temp = dealer.drawCard();
        System.out.println(temp);
        dealer.showDeck();
        player.takeCard(temp);
        scanner.close();
    }
}