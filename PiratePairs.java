import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        System.out.println("Amount of Players: " + people);
        Player[] players = new Player[people];
        for(int i = 0; i<people;i++){
            System.out.println("Enter Names ");
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }
        // Sets new dealer 
        Dealer dealer = new Dealer(people);
        Player player = new Player(people);
        dealer.showDeck();
        //Shuffles
        dealer.shuffle();
        dealer.showDeck();
        Player currentPlayer = players[0];
        //Draw Cards
        int temp = dealer.drawCard();
        System.out.println(temp);
        dealer.showDeck();
        currentPlayer.takeCard(temp);
        player.showHand();
        //Take Card
        dealer.drawCard();
        currentPlayer.takeCard(temp);
        currentPlayer.showHand();
        currentPlayer.checkHand();
        
        scanner.close();
    }
}