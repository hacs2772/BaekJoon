import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner xx = new Scanner(System.in);
		int nn = xx.nextInt();
		int black = xx.nextInt();
		int[] cards = new int[nn];	// 이렇게 int array를 생성하는 것이다!
		
		for (int i = 0; i < nn; i++) {
			cards[i] = xx.nextInt();	// 배열에 입력된 수를 집어넣는다.
		}
		int Fresult = counting(nn, black, cards);	// counting메소드로 변수를 보내고 result로 리턴값을 받는다.
		System.out.println(Fresult);		// 최종 출력
    }
	
	static int counting(int nn, int black, int[] cards) {
		int result = 0;
		
		for (int i = 0; i < nn-2; i++) {		// 첫번째 카드이고 앞에 카드 2장이 더 있으니 nn-2를 해준 모습이다.
			for (int j = i+1; j < nn-1; j++) {		// 두번째 카드이고 앞에 카드 1장이 더 있으니 nn-1를 해준 모습이다.
				for (int j2 = j+1; j2 < nn; j2++) { 	// 마지막 카드이기에 nn를 해준 모습이다.
					int sum = cards[i] + cards[j] + cards[j2];	// 3개에 for문을 거쳐 여러개의 sum이 계속 삽입수정 되고 있다.
					
					if (black == sum) {		// 블랙잭인 경우
						return sum;		// 바로 sum을 리턴한다.
					}
					if (sum < black && sum > result) {	// 블랙잭은 아니지만 그 전 result보다 큰경우
						result = sum;		// 일단 result에 sum을 저장한다.
					}
				}
			}
		}
		return result;
	}
}
