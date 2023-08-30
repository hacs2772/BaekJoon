import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		
		Scanner xx = new Scanner(System.in);

        int x = xx.nextInt();
        int y = xx.nextInt();
        


        xx.close();
        
        if (x > y) {
			System.out.println(">");
		}else if (x < y) {
			System.out.println("<");
		}else if (x == y) {
			System.out.println("==");
		}
        

	}
}
