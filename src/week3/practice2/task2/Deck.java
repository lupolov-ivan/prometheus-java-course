package src.week3.practice2.task2;

import java.util.Random;

public class Deck {

    Card[] rusDeck = new Card[36];
    public int sizeDeck;

    public Deck(){
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                rusDeck[sizeDeck] = new Card(Rank.values[j],Suit.values[i]);
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

            for (int i = 0; i < Rank.values.length; i++) {
                if(c1.getRank() == Rank.values[i]){
                    c1Index = i;
                }
                if (c2.getRank() == Rank.values[i]){
                    c2Index = i;
                }
            }
            if (c1Index < c2Index) {               // card1 > card2
                result = 1;
            } else if (c1Index > c2Index){         // card1 < card2
                result = -1;
            }
            return result;
        }

        for (int i = 0; i < Suit.values.length; i++) { // сравниваем по масти
            if(c1.getSuit() == Suit.values[i]){
                c1Index = i;
            }
            if (c2.getSuit() == Suit.values[i]){
                c2Index = i;
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
