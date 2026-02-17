import java.util.Arrays;

public class Player {
    private int score;
    private String name;
    private int[] hand = new int[0];
    //Initializes player
    public Player(String name,int people) {
        this.name = name;
        score = 0;
        int points = 0;
    }
    public String getName(){
        return name;
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
        System.out.println(name+"hand" + Arrays.toString(hand));
    }//checks hand for score
     public void checkHand(){
        boolean[] usedCard = new boolean[hand.length];
        if(hand.length>=2){
            for(int i = 0; i<hand.length;i++){
                 if(!usedCard[i]){
                    for(int j = i+1;j<hand.length;j++){
                        if(!usedCard[j] && hand[i] == hand[j]){
                            score += hand[i];
                            usedCard[i] = true;
                            usedCard[j] = true;
                            
                        }
                    }
                 }
               } 
            } 
        System.out.println(score);
    }
   
}
