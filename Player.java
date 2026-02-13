public class Player {
    private int score;
    private int[] hand = new int[0];
    public Player(int people) {
        score = (int) (60 / people + 1);
        int idvScore = 0;
        int points = 0;
    }

   
    public int getPoints(int idv, int points) {

        return points;
    }

    public int getScore() {
        return score;
    }
    public void takeCard(int card){
        int temp = hand[card];
        temp = hand[card];
    }
    
}
