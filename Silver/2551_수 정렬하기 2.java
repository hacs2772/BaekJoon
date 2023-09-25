import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

		// BufferedReader와 BufferedWriter를 try-with-resources 문으로 생성
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
        	int deep;
        	deep = Integer.parseInt(br.readLine());
        	ArrayList<Integer> result = new ArrayList<>();
            
            for (int j = 0; j < deep; j++) {
                result.add(Integer.parseInt(br.readLine()));
			}
            Collections.sort(result);
            for (int num : result) {
                bw.write(num + "\n");
            }
            bw.flush();
        }
		
    }
}
