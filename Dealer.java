import java.util.Arrays;

public class Dealer {

    private int deck[] = new int[55];

    public Dealer(int people) {

        int indx = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                deck[indx] = i;
                indx++;
            }
        }
        // 60/players+1
    }

    public void showDeck() {
        System.out.println(Arrays.toString(deck));
    }

    public static int startCards(int people){
        deck[(int)(Math.random()*55)] = 
        return deck[];
    }

    public void setPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i] = i;
        }
        System.out.println(Arrays.toString((players)));

    }

    public int shuffle() {
        for (int i = deck.length - 1; i >= 0; i--) {
            deck[i] = (int) (Math.random() * deck);
        }
    }
}