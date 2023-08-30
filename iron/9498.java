import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		
		Scanner xx = new Scanner(System.in);

        int x = xx.nextInt();
        


        xx.close();
        
        if (x >= 90 && x <= 100) {
			System.out.println("A");
		}else if (x >= 80 && x < 90) {
			System.out.println("B");
		}else if (x >=70 && x < 80) {
			System.out.println("C");
		}else if (x >=60 && x < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
        

	}
}
