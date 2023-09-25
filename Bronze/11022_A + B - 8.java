import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

		// BufferedReader와 BufferedWriter를 try-with-resources 문으로 생성
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
        	int deep;
        	deep = Integer.parseInt(br.readLine());

            // 문자열 분리
            StringTokenizer st;
            
            for (int j = 0; j < deep; j++) {
            	st = new StringTokenizer(br.readLine(), " ");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
               
                
                if (num1 == 0 && num2 == 0) {
					break;
				}
                
                bw.write("Case #"+ (j+1) +": "+ num1 +" + "+ num2+ " = " +(num1 + num2) + "\n");
			}
        }
		
    }
}
