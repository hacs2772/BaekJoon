import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner xx = new Scanner(System.in);

        int A = xx.nextInt();
        int B = xx.nextInt();
        int C = xx.nextInt();
        
        
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println((A%C)*(B%C)%C);

        xx.close();
        

	}
}
