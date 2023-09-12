import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner xx = new Scanner(System.in);
		int deep = xx.nextInt();
		double[] score = new double[deep];
		double sum = 0, max = 0;
		
		// 깊이만큼 테스트케이스를 입력받을 수 있음
		for (int i = 0; i < deep; i++) {	// 배열 입력받는 포문
			score[i] = xx.nextDouble();
			if (max < score[i]) {
				max = score[i];
			}
		}
		for (int i = 0; i < deep; i++) {	// 값을 정하는 것
			score[i] = (score[i]/max)*100.0;
			sum += score[i];
		}
		System.out.println(sum/deep);
    }
}
