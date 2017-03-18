package src.week3.practice2.task2;

import java.util.Random;

public class Desk {

    Card[] rusDesk = new Card[36];
    public int sizeDesk;

    public Desk(){
        for (int i = 0; i < Suit.values.length; i++) {
            for (int j = 0; j < Rank.values.length; j++) {
                rusDesk[sizeDesk] = new Card(Rank.values[j],Suit.values[i]);
                sizeDesk++;
            }
        }
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = rusDesk.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card crd = rusDesk[index];
            rusDesk[index] = rusDesk[i];
            rusDesk[i] = crd;
        }
    }

    public void order() {
        int h = 0;
        for (int j = 0; j < Suit.values.length; j++) {
            for (int i = 0; i < rusDesk.length; i++) {
                if (rusDesk[i].getSuit().getName() == Suit.values[j].getName()) {
                    Card tmp = rusDesk[h];
                    rusDesk[h] = rusDesk[i];
                    rusDesk[i] = tmp;
                    h++;
                }
            }
        }
    }

    public boolean hasNext() {
        if(sizeDesk != 0) {
            return true;
        }
        return false;
    }

    public Card drawOne() {


        return null;
    }
}
