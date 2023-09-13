import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int total = xx.nextInt();
        int deep = xx.nextInt();
        int result = 0;
        
        for (int i = 0; i < deep; i++) {
			int price = xx.nextInt();
			int num = xx.nextInt();
			
			result += price*num;
		}
        if (total == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
        
    }
}
