import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		// BufferedReader와 BufferedWriter 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// 표준 입력을 받기 위한 BufferedReader 생성, like scanner
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		// 표준 출력을 위한 BufferedWriter 생성, like sysoutprint
		
		// 입력처리
		int deep = Integer.parseInt(br.readLine());
		
		
		// 문자열 분리
		StringTokenizer st;	
		
		
		for (int i = 0; i < deep; i++) {
			st = new StringTokenizer(br.readLine()," ");	// 입력되는 것을 읽어와 공백을 기준으로 문자열을 나누는 StringTokenizer 생성, 띄어쓰기 마다 토큰을 구분한다
			int num1 = Integer.parseInt(st.nextToken()); 
			int num2 = Integer.parseInt(st.nextToken()); 
			bw.write("Case #"+(i+1)+": "+(num1+num2) +"\n");
		}
		br.close();
		
		bw.flush();  // 버퍼 비우기, 버퍼 내용을 출력 장치로 내보냄
		bw.close();  // 출력 스트림 닫기

    }
}
