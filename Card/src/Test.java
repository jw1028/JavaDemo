import java.util.*;




public class Test{
    public static void main(String[] args) {
        DeckCard deckCard = new DeckCard();
        List<Card> cardList = deckCard.buyCard();
        System.out.println("============买牌=========");
        System.out.println(cardList);
        deckCard.washCard(cardList);
        System.out.println("============洗牌=========");
        System.out.println(cardList);
        System.out.println("=============发牌=========");

        //3个人   每个人5张牌
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();
        //二维数组
        List<List<Card>> hands = new ArrayList<>();
        hands.add(hands1);
        hands.add(hands2);
        hands.add(hands3);

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //揭牌
                Card card = cardList.remove(0);
                hands.get(i).add(card);
            }
        }*/
        //轮流揭牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                //揭牌
                Card card = cardList.remove(0);
                hands.get(j).add(card);
            }
        }
        System.out.println("第一个人：");
        System.out.println(hands1);
        System.out.println("第二个人：");
        System.out.println(hands2);
        System.out.println("第三个人：");
        System.out.println(hands3);
        System.out.println("剩余的牌：");
        System.out.println(cardList);
    }
}
