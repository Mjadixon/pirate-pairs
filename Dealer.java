import java.util.Arrays;

public class Dealer {

    private int deck[] = new int[55];

    public Dealer(int people) {
        // deck
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

    public void shuffle() {
        for (int i = deck.length - 1; i >= 0; i--) {
            int r = (int) (Math.random() * 10);
            int temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;

        }
    }

    public int drawCard() {
        int temp = deck[deck.length - 1];
        int tempDeck[] = new int[deck.length - 1];
        for (int i = 0; i < tempDeck.length; i++) {
            tempDeck[i] = deck[i];
        }
        deck = tempDeck;

        return temp;
    }
}