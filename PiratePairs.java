import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        System.out.println("Amount of Players: " + people);
        Player[] players = new Player[people];
        for(int i = 0; i< people;i++){
             System.out.println("Enter Name ");
            String name = scanner.nextLine();
            players[i] = new Player(name,people);
            System.out.println("Names: "+ name);
             
        }
       
        // Sets new dealer 
        Dealer dealer = new Dealer(people);
        dealer.showDeck();
        //Shuffles
        dealer.shuffle();
        dealer.showDeck();
        Player currentPlayer = players[0];
        //Draw Cards
        for( Player player : players){
        int card = dealer.drawCard();
        System.out.println(card);
        dealer.showDeck();
        currentPlayer.takeCard(card);
        currentPlayer.showHand();
        
        }
      currentPlayer.checkHand();
        //player.showHand();
        //Take Card
        
        //currentPlayer.checkHand();
        
        scanner.close();
    }
}