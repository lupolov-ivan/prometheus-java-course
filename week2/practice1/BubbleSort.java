package week2.practice1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6, 44, 5, -7, 0};
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
