import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
		try {
			StringTokenizer num;
			String xx = "";
			
			while((xx=br.readLine()) != null) {
				num = new StringTokenizer(xx);
				if(num.hasMoreTokens()) {
				bw.write(Integer.parseInt(num.nextToken()) + Integer.parseInt(num.nextToken()) + "\n");
				}else {
					break;
				}
			}
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
