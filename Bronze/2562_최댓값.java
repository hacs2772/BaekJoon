import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner xx = new Scanner(System.in);
		int deep = 9;
		int[] score = new int[deep];
		int max = 0;
		int place = 0;
		
		// 깊이만큼 테스트케이스를 입력받을 수 있음
		for (int i = 0; i < deep; i++) {	// 배열 입력받는 포문
			score[i] = xx.nextInt();
			if (max < score[i]) {
				max = score[i];
				place = i+1;
			}
		}
		System.out.println(max);
		System.out.println(place);
    }
}
