import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int star = xx.nextInt();
        
        for (int i = 0; i < star + 1; i++) {
			
        	for (int j2 = 0; j2 < i; j2++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
    }
}
