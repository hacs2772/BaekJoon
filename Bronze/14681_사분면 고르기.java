import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner xx = new Scanner(System.in);

		int x = xx.nextInt();
		int y = xx.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			}else { // y가 0보다 작은경우
				System.out.println(4);
			}
		}else { // x가 0보다 작은경우
			if(y > 0) {
				System.out.println(2);
			}else { // y가 0보다 작은경우
				System.out.println(3);
			}
		}
	}
}
