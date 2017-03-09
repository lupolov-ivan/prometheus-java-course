package week2.practice1;

public class BinarySearch {
    public static void main(String[] args) {

        int data[] = {-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50};
        int numberToFind = 50;

        int index = -1;

        if (data != null) {

            int left = 0;
            int right = data.length;

            while (right > left) {

                int mid = left + (right - left)/2;

                if (data[mid] == numberToFind) {
                    index = mid;
                    break;
                } else if (numberToFind < data[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }
}
