import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        boolean student[] = new boolean[31]; // 일단 빈 틀을 만들어준다.
        
        for (int i = 0; i < 28; i++) {
			student[xx.nextInt()] = true;	// 그 빈틀에 인덱스가 입력되면 그 인덱스는 true로 변한다.
		}
        for (int i = 1; i < 31; i++) {
			if (!student[i]) {			// 입력받았던 인덱스에 true가 아니라면
				// 결과 출력
				System.out.println(i);	// 인덱스 값을 반환하게 된다.
			}
		}
        
    }
}
