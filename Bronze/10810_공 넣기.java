import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner xx = new Scanner(System.in);
    	int index = xx.nextInt();
        int deep = xx.nextInt();
        int[] basket = new int[index];
        
        for (int i = 0; i < deep; i++) {
        	int start = xx.nextInt();
        	int end = xx.nextInt();
        	int num = xx.nextInt();
        	for (int j = start-1; j < end; j++) {
				basket[j] = num;
			}
		}
        for (int i = 0; i < index; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
