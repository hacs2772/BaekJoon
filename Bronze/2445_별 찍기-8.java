import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int n = xx.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // 왼쪽 별 찍기
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 공백 찍기
            for (int k = 2 * (n - i); k > 0; k--) {
                System.out.print(" ");
            }

            // 오른쪽 별 찍기
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 줄 바꾸기
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 별 찍기
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 공백 찍기
            for (int k = 2 * (n - i); k > 0; k--) {
                System.out.print(" ");
            }

            // 오른쪽 별 찍기
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 줄 바꾸기
            System.out.println();
        }
    }
}
