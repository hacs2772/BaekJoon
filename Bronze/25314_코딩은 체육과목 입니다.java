import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        String result = "";
        
        for (int i = 0; i < deep/4; i++) {
			result += "long ";
		}
        System.out.println(result+"int");
        
    }
}
