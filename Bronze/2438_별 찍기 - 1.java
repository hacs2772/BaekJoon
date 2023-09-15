import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int height = xx.nextInt();
        
        for (int i = 1; i <= height; i++) {
            
            // 별을 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // 줄 바꿈
            System.out.println();
        }
    }
}
