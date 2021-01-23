import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DeckCard {
    public static final String[] suits = {"♥","♠","♦","♣"};

    public List<Card> buyCard() {
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13 ; j++) {
                String suit = suits[i];
                int rank = j;
                Card card = new Card(suit,rank);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public void swap(List<Card> cardList,int i,int j) {
        Card tmp = cardList.get(i);
        cardList.set(i,cardList.get(j));
        cardList.set(j,tmp);
    }
    public void washCard(List<Card> cardList) {
        for (int i = cardList.size()-1; i > 0 ; i--) {
            Random random = new Random();
            int rand = random.nextInt(i);
            swap(cardList,i,rand);
        }
    }

    public void game() {

    }
}