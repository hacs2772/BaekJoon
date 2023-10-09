import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);
		
		int count = 0;

		String st = xx.next();

		// 홀수든 짝수든 절반까지 돌아서 데칼코마니로 같아야한다.
		for(int j = 0; j < st.length()/2; j++) {
			
			// 데칼코마니처럼 입력받은 값을 반으로 접었을 때 인덱스가 서로 반대인 값이 일치하는 경우 count 해준다.
			if(st.charAt(j) == st.charAt(st.length() - (j+1))) {
				count++;
			}
		}
		// 일치하는 경우가 입력받은 값의 절반과 같다면 == 전부 일치하는 팰린드롬
		if (count == st.length()/2) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
}
