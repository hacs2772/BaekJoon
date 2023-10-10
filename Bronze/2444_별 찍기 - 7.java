import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);

		int star = xx.nextInt();

		for (int i = 1; i < star + 1; i++) {
			
			
			for (int j = 0; j < star - i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < i*2 - 1; j2++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		for (int i = star -1; i > 0; i--) {
			for (int j = star - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j2 =  i*2 - 1; j2 > 0; j2--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		
	}
}
