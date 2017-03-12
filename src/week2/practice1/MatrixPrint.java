package src.week2.practice1;

public class MatrixPrint {
    public static void main(String[] args) {

        String [][] matrix = new String[5][5];
        int count = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.toString(count);
                count++;

                if ((i == j)||(i+j == 4)) {
                    System.out.print(" * ");
                } else {
                    if (Integer.parseInt(matrix[i][j]) < 10) {
                        System.out.print(" " + matrix[i][j] + " ");
                    } else {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
