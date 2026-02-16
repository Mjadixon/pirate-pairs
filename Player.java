import java.util.Arrays;

public class Player {
    private int score;
    private int playerScore;
    private int[] hand = new int[0];
    //Initializes player
    public Player(String name,int people) {
        score = (int) (60 / people + 1);
        int points = 0;
    }
   
    //Grabs Score
    public int getScore() {
        return score;
    }
    //Grabs card from Deck
    public void takeCard(int card){
        int[] newHand = new int[hand.length +1];
        for(int i = 0; i<hand.length;i++){
            newHand[i] = hand[i];
        }
        newHand[newHand.length-1] = card;
        hand = newHand;
    }//Shows Hand
    public void showHand(){
        System.out.println(Arrays.toString(hand));
    }//checks hand for score
     public void checkHand(){
        int lastCard = hand[hand.length-2];
        int currentCard = hand[hand.length-1];
        if(hand.length>=2){
            if(lastCard == currentCard && hand[hand.length]>=2){
                playerScore += currentCard;
            }
            else{
                playerScore += 0;
            }
        }
        System.out.println(playerScore);
    }
   public void wantHand(){
    if(true){
        
    }
   }
}
