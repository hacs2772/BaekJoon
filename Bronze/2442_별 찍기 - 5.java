import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int star = xx.nextInt();
        
        for (int i = 0; i < star; i++) {
			for (int j = star - i -1; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print("*");
			}
			for (int j2 = 0; j2 < i; j2++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
    }
}
