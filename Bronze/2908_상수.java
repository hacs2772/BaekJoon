import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        
        int nu1 = xx.nextInt();
        int nu2 = xx.nextInt();
        
		nu1 = Integer.parseInt(new StringBuilder().append(nu1).reverse().toString());
		nu2 = Integer.parseInt(new StringBuilder().append(nu2).reverse().toString());
		
		System.out.println(nu1 > nu2 ? nu1 : nu2);
    }
}
