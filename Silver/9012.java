import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
		// 이번건 BufferedReader를 이용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deep = Integer.parseInt(br.readLine());

        for (int i = 0; i < deep; i++) {
            String xx = br.readLine();	// 괄호 문자열을 입력받는다
            Stack<String> stack = new Stack();		// 스택 기능을 추가한다.
            boolean VPS = true;		// boolean을 통해 vps인지 아닌지 유무를 파악할 예정이다.
            for (int j = 0; j < xx.length(); j++) {		// 입력받은 괄호 길이만큼 돈다
                String c = String.valueOf(xx.charAt(j));	// .valueOf : 문자열 값을 생성하는 메소드, 여러 가지 데이터 유형을 문자열로 변환하는 데 사용   
                											// .charAt(j) : xx라는 문자열에서 j 위치에 있는 문자를 추출하는 부분, charAt() 메소드는 문자열에서 특정 인덱스 위치에 있는 문자를 반환함, j는 인덱스
                // 여는 괄호이면 stack에 push
                if(c.equals("(")) {
                    stack.push(c);
                }else if(c.equals(")")){			// 다음으로 ")"닫힘 괄호가 들어왔는데
                    if(!stack.empty()){			// 앞에 스택이 비어있지 않다면 (즉 스택에 여는 괄호가 존재한다면)
                        stack.pop();		// 스택의 값을 pop
                    } else {					// 앞에 스택이 비어있다면 
                        VPS = false;		// false
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) {
                VPS = false;		// 스택에 뭐가 남아 있다면 false(아마 '(' 이거나 ')'이거 겠지)
            }
            if(VPS)
                System.out.println("YES");	// true
            else
                System.out.println("NO");	// false
        }
    }
}
// 스택 메소드들 설명

// peek(): 스택의 맨 위에 있는 요소를 반환하지만 제거하지 않는다. 스택의 맨 위에 어떤 요소가 있는지 확인하는 데 사용된다.
// isEmpty(): 스택이 비어 있는지 확인한다. 스택이 비어 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
// size(): 스택에 저장된 요소의 개수를 반환한다..
// search(element): 스택에서 특정 요소의 위치를 찾는다. 요소가 스택에 없으면 -1을 반환하고, 요소가 스택에 있으면 해당 요소의 인덱스를 반환한다. 인덱스는 맨 위 요소가 1부터 시작한다.
// clear(): 스택의 모든 요소를 제거하여 비운다.
