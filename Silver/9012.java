import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws IOException {
		// 이번건 BufferedReader를 이요한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deep = Integer.parseInt(br.readLine());

        for (int i = 0; i < deep; i++) {
            String xx = br.readLine();	// 괄호 문자열을 입력받는다
            Stack<String> stack = new Stack();
            boolean VPS = true;		// boolean을 통해 vps인지 아닌지 유무를 파악할 예정이다.
            for (int j = 0; j < xx.length(); j++) {		// 입력받은 괄호 길이만큼 돈다
                String c = String.valueOf(xx.charAt(j));	// 괄호 하나하나

                // 여는 괄호이면 stack에 push
                if(c.equals("(")) {
                    stack.push(c);
                }else if(c.equals(")")){			// 다음으로 )닫힘 괄호가 들어왔는데
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
