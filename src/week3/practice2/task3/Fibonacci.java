package src.week3.practice2.task3;

public class Fibonacci {
    public long getNumber(int position) {
        if(position <= 0) {
            return -1;
        }
        if (position < 3) {
            return 1;
        }
        return  getNumber(position - 1) + getNumber(position - 2);
    }
}