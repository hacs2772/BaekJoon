import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner xx = new Scanner(System.in);
		int deep = xx.nextInt();
		int left = 0;
		int right = 0;
		
		// 깊이만큼 테스트케이스를 입력받을 수 있음
		for (int i = 0; i < deep; i++) {
			left = xx.nextInt();
			right = xx.nextInt();
		
			String result = Bridge(left, right);	// Bridge메소드로 변수를 보내고 result로 리턴값을 받는다.
			System.out.println(result);		// 최종 출력
		}
  }
	
	// 수식은 : right! / left! * (right - left)!
	static String Bridge(int left, int right) {
		double x = 1;	// right!			// 1부터 시작하는이유는 0! = 1 이기 때문이다 (0을 넣게 된다면 곱해도 계속 0이 나오기도하고)
		double y = 1;	// left!			// 최대 30!까지 계산을 해야하니 double로 만든다.
		double z = 1;	// (right - left)!
		
		// right!
		for (int i = 1; i <= right; i++) {	// i도 0!이 1이기도하고 0을 곱하면 계속 0이 나오니 1부터 시작하고 있다.
			x *= i;
		}
		// left!
		for (int j = 1; j <= left; j++) {
			y *= j;
		}
		// (right - left)!
		for (int k = 1; k <= (right - left); k++) {
			z *= k;
		}
		
		double result = x/(y*z);	// 결과값
		
		DecimalFormat df = new DecimalFormat("#");	// 소수점 제거
		String formatted = df.format(result);		// 소수점 제거 result에 적용
		
		return formatted;	// 포멧된 값 리턴
	}
}
