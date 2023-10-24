import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //2908
        Scanner xx = new Scanner(System.in);
        
        int nu1 = xx.nextInt();
        int nu2 = xx.nextInt();
        
		nu1 = Integer.parseInt(new StringBuilder().append(nu1).reverse().toString());
		nu2 = Integer.parseInt(new StringBuilder().append(nu2).reverse().toString());
		
		System.out.println(nu1 > nu2 ? nu1 : nu2);
		
		/*
		 * int result = 0; String str = String.valueOf(nu1); for (int i = str.length() -
		 * 1; i >= 0; i--) { result = result * 10 + (str.charAt(i) - '0'); }
		 * System.out.println("뒤집기 결과 = "+result);
		 */
    }
}
