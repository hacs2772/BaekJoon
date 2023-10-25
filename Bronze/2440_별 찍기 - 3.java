import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //2908
        Scanner xx = new Scanner(System.in);
        
        int deep = xx.nextInt();
        
        for (int i = deep; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
    }
}
