package src.week4.practice3.addtask.deskEnum;

import java.util.Random;

public class Deck {

    Card[] rusDeck = new Card[36];
    public int sizeDeck;

    public Deck(){
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                rusDeck[sizeDeck] = new Card(rank, suit);
                sizeDeck++;
            }
        }
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = rusDeck.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card crd = rusDeck[index];
            rusDeck[index] = rusDeck[i];
            rusDeck[i] = crd;
        }
    }

    public void order() {
        for (int i = 0; i < sizeDeck; i++) {
            for (int j = 0; j < sizeDeck - 1; j++) {
                if (compareCard(rusDeck[j], rusDeck[j + 1]) < 0) {
                    Card tmp = rusDeck[j];
                    rusDeck[j] = rusDeck[j + 1];
                    rusDeck[j + 1] = tmp;
                }
            }
        }
    }

    public int compareCard(Card c1, Card c2) {
        int c1Index = 0;
        int c2Index = 0;
        int result = 0;

        if(c1.getSuit() == c2.getSuit()) {  // если масти равны, сравниваем по рангу

            if (c1.getRank() == c2.getRank()){ // если карты равны вернем 0
                return result;
            }

            for (Rank rank: Rank.values()) {
                if(c1.getRank() == rank) {
                    c1Index = rank.ordinal();
                }
                if (c2.getRank() == rank) {
                    c2Index = rank.ordinal();
                }
            }
            if (c1Index < c2Index) {               // card1 > card2
                result = 1;
            } else if (c1Index > c2Index){         // card1 < card2
                result = -1;
            }
            return result;
        }

        for (Suit suit: Suit.values()) { // сравниваем по масти
            if(c1.getSuit() == suit) {
                c1Index = suit.ordinal();
            }
            if (c2.getSuit() == suit) {
                c2Index = suit.ordinal();
            }
        }
        if (c1Index < c2Index) {               // card1 > card2
            result = 1;
        } else if (c1Index > c2Index){         // card1 < card2
            result = -1;
        }
        return result;
    }

    public boolean hasNext() {
        if(sizeDeck != 0) {
            return true;
        }
        return false;
    }

    public Card drawOne() {
        if (sizeDeck == 0) {
            return null;
        }
        Card currentCard = rusDeck[sizeDeck -1];
        sizeDeck--;
        return currentCard;
    }
}
