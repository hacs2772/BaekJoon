import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < deep; i++) {
			result.add(xx.nextInt());
		}
        Collections.sort(result);
        int firstElement = result.get(0);
        int lastElement = result.get(deep-1);
        System.out.println(firstElement + " "+ lastElement);
    }
}
