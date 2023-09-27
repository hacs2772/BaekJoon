import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner xx = new Scanner(System.in);
    	int index = xx.nextInt();
        int deep = xx.nextInt();
        int[] basket = new int[index];
        
        // 바구니부터 만들기
        for (int i = 0; i < index; i++) {
        	basket[i] = i+1;
		}
        
        // 바구니 숫자 바꾸기
        for (int i = 0; i < deep; i++) {
			int num1 = xx.nextInt(); 
			int num2 = xx.nextInt();
			
			// 인덱스 범위 내의 요소를 역순으로 바꾸기
            reverseArray(basket, num1 - 1, num2 - 1);
        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(basket[i] + " ");
        }
    }
    
    public static void reverseArray(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
