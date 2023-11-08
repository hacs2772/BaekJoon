import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int star = xx.nextInt();
        
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (star - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
