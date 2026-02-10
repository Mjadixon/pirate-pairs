import java.util.Arrays;

public class Dealer {

    private int[] players = new int[10];
    private int deck[] = new int[55];
    private int score;

    public Dealer() {
        score = (int) (13);
        int indx = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 10; i++) {
                deck[indx] = i;
            }
        } // 60/players+1
    }

    public void showDeck() {
        System.out.println("here");
        System.out.println(Arrays.toString(deck));
    }
}