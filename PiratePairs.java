import java.util.Arrays;
import java.util.Scanner;

public class PiratePairs {
    public static void main(String[] args) {
        //Scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players do you want?");
        int people = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Amount of Players: " + people);
        Player[] players = new Player[people];
        for(int i = 0; i< people;i++){
             System.out.println("Enter Name ");
            String name = scanner.nextLine();
            players[i] = new Player(name,people);
            System.out.println("Names: "+ name);  
        }
         //global vars
        int whichPlayer = 0;
        boolean gameover = false;

        // Sets new dealer 
        Dealer dealer = new Dealer(people);
        dealer.showDeck();
        //Shuffles
        dealer.shuffle();
        dealer.showDeck();

      //Starts Game
    while(!gameover){
        Player currentPlayer = players[whichPlayer];
       
        int card = dealer.drawCard();
        currentPlayer.takeCard(card);
        currentPlayer.showHand();
        currentPlayer.checkHand();
        if(currentPlayer.getScore()>11){
            gameover = true;
            System.out.print(currentPlayer.getName() + " has gone over and has lost");
        }
            if(currentPlayer.getLoss()){
                //goes to next player
                whichPlayer = (whichPlayer + 1) % players.length;
            }
             if(dealer.getCurrentSize()==0){
                gameover= true;
            }
            whichPlayer = (whichPlayer + 1) % players.length;
    }
    scanner.close();
    }
}