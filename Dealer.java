import java.util.Arrays;

public class Dealer {

    private Player[] players = new Player[10];
    private int deck[] = new int[55];
    private int score;

    public Dealer() {
        score = (int) (13);
        int indx = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                deck[indx] = i;
                indx++;
            }
        } // 60/players+1
    }

    public void showDeck() {
        System.out.println(Arrays.toString(deck));
    }

    public void setPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i] = i;
        }
        System.out.println(Arrays.toString((players)));

    }
}