package src.week4.practice3;

public class Comparator {
    public int compare(int a, int b){
        if (a > b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }
}
