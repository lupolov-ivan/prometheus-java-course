package src.week2.practice1;

public class ShellSort {
    public static void main(String[] args) {
        int array [] = {2,4,65,7,5,65,5,877,-2,1,0,-5,-34,0,4};

        int length = array.length;

        for (int d = length/2; d >= 1; d = d/2) {
            for (int i = d; i < length; i++) {
                for (int j = i; j >= d ; j = j-d) {
                    if (array[j] < array[j-d]) {
                        int tmp = array[j-d];
                        array[j-d] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
