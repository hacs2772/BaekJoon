import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        int result = 0;
        
        for (int i = 0; i < deep; i++) {
			result += i+1;
		}
        System.out.println(result);
        
    }
}
