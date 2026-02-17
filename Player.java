import java.util.Arrays;

public class Player {
    private int score;
    private String name;
    private int[] hand = new int[0];
    private int totalScore;

    //Initializes player
    public Player(String name,int people) {
        this.name = name;
        this.score = 0;
        this.totalScore =  (60 / people)+1;
    }
    //gets name
    public String getName(){
        return name;
    }
    // grabs score
    public int getScore(){
        return score;
    }
     //if score is greater than max
    public boolean getLoss(){
        return score > totalScore;
    }

    public void resetScore(){
        score = 0;
    }

    //Grabs card from Deck
    public void takeCard(int card){
        int[] newHand = new int[hand.length +1];
        for(int i = 0; i<hand.length;i++){
            newHand[i] = hand[i];
        }
        newHand[newHand.length-1] = card;
        hand = newHand;
    }
    //Shows Hand
    public void showHand(){
        System.out.println(name+" hand" + Arrays.toString(hand));
    }
    //checks hand for score
     public void checkHand(){
       
        if(hand.length>=2){// if hand is 2
            int lastCard = hand[hand.length-1];
             boolean ifMatched = false;
            for(int i = 0; i<hand.length-1;i++){
                 if(!ifMatched && lastCard ==hand[i]){
                        score += lastCard;
                        ifMatched = true;
              }
              
            }   
        }
        System.out.println(score);
    }
    public boolean wantCard(int card){
        int boundary = card;
        if(score > totalScore){
            return false;
        } else if(boundary > 7){
            return false;
        } else{
            return true;
        }
    }
   
}
