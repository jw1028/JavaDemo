class Card {
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';*/
        //显示
        return  "["+suit+","+rank+"]";
    }
}
