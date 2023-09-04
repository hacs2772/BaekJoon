import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner xx = new Scanner(System.in);
		int ff = xx.nextInt();

        for (int i = 1; i < 10; i++) {
        	int result = ff * i;
        	System.out.println(ff + " * " + i + " = " + result);
        }
    }
}
