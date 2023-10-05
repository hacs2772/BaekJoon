import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner xx = new Scanner(System.in);
        int[] basket = new int[42];
        int count = 0;
        
        // 바구니 숫자 바꾸기
        for (int i = 0; i < 10; i++) {
			int num = xx.nextInt(); 
			basket[(num%42)] = (num%42)+1;
        }
        
        // 결과물 출력
        for (int i = 0; i < 42; i++) {
        	if (basket[i] >= 1) {
				count++;
			}
        }
        System.out.println(count);
    }
}
