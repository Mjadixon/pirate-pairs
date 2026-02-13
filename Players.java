public class Players {
    private int score;

    public Players(int people) {
        score = (int) (60 / people + 1);
        idvScore = 0
    }

    public int getPoints() {

    }

    public int getScore() {
        return score;
    }
}
