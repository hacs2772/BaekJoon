import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = xx.nextInt();
            }
        }

        int maxVal = 0;
        int maxRow = 1;
        int maxCol = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                    maxRow = i+1;
                    maxCol = j+1;
                }
            }
        }

        System.out.println(maxVal);
        System.out.println(maxRow + " " + maxCol);
    }
}
