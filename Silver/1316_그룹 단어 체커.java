import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);
		int deep = xx.nextInt();
		// 그룹단어가 아닌경우 --로 하나하나씩 카운트가 빠지는 구조라 초기값을 입력개수 N으로 설정해주었다.
		int count = deep;


		for(int i = 0; i < deep; i++){
			String st = xx.next();
			
			// 알파벳의 개수가 26개 이기에 boolean[26]을 하였다.(디폴트 값은 false)
			boolean check[] = new boolean[26];

			// lenght-1을 해야지 j+1과 비교할 수 있다.
			for(int j = 0; j < st.length() - 1; j++) {
				
				// 연속된 경우가 아닐 때(지정된 인덱스에 해당하는 값과 그 다음값을 비교하여 다를경우)
				if(st.charAt(j) != st.charAt(j + 1)) {
					
					// 아까 나왔던 단어가 또 나왔을 때 (true자리에 또 true가 온 경우)
					if(check[st.charAt(j + 1) - 97] == true) {
						count--;
						
						// 한번 그룹 단어가 아닌놈은 영원히 그룹단어가 아니기에 뒤엔 볼필요도 없어서 바로 break로 빠져나오는 모습이다.
						break;
					}
					
				}
				// 연속되는 경우이거나, 연속되진 않았는데 나왔던 단어가 아닌 처음나왔던 단어인경우 => false에서 true로 변경해 준다.
				// 여기서 - 97을 한 이유는 아스키코드로 소문자a가 97이니 -97을 하여 a의 인덱스 값을 0으로 만들어 주기 위함이다.
				check[st.charAt(j) - 97] = true;
			}
		}
		// 답 출력
		System.out.println(count);
	}
}



// 이문제는 결국 아닌걸 찾으면 된다
// 그룹단어가 맞는 조건은 
// 1.연속된 문자로만 나왔을 때
// 2.아무것도 겹치지 않은 문자로만 나왔을 때
// 3.연속된 부분도 있고, 연속되지 않은 문자도 있는데  연속된 것 또는 연속되지 않은 것이 한칸 이상 뛰고 또 나오지 않을때
// 4.연속되지 않은 문자로만 있는데  앞서 나왔던 문자가 한칸 이상 뛰고 또 나오지 않을 때
// 그룹 단어가 맞는걸 카운터 하려니 맞는 조건이 많아 쉽지가 않고

// 그룹 단어가 아닌 조건은 
// 1.연속된 경우가 아닌 아까 나왔던 단어가 또 나올 때 
// 이 한가지 경우만 그룹단어가 아니기에 
// 그룹 단어가 아닌 경우 -- 를 해주면 좀더 쉽게 풀 수 있다.
