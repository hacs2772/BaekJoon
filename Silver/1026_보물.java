import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        Integer[] aa = new Integer[deep];	//Array.sort를 사용하려면 이런 형식으로 배열을 만들어 줘야한다.
        Integer[] bb = new Integer[deep];
        int result = 0;
        
        for (int i = 0; i < deep; i++) {
			aa[i] = xx.nextInt();
		}
        for (int i = 0; i < deep; i++) {
			bb[i] = xx.nextInt();
		}
        
        Arrays.sort(aa, Collections.reverseOrder());	// 내림차순으로 정렬해준다
        Arrays.sort(bb);	// 오름차순으로 정렬해준다
        
        for (int i = 0; i < deep; i++) {
            result += aa[i]*bb[i];
        }
        System.out.println(result);
        
    }
}
