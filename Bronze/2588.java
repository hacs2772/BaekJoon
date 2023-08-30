import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner xx = new Scanner(System.in);

        int x = xx.nextInt();
        int y = xx.nextInt();
        
        int one = y%10;
        int ten = (y%100 - one) / 10;
        int thu = (y%1000 - ten - one) / 100;
        
        System.out.println(x*one);
        System.out.println(x*ten);
        System.out.println(x*thu);
        System.out.println(x*y);
        
        

        xx.close();
        

	}
}
