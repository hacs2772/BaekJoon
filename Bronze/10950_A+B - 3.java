import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        int[] result = new int[deep];
        
        for (int i = 0; i < deep; i++) {
			int num1 = xx.nextInt();
			int num2 = xx.nextInt();
			
			result[i] = num1 + num2;
		}
        for (int k : result) {
			System.out.println(k);
		}
        
    }
}
