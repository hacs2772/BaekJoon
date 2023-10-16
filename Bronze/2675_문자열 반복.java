import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);
    	int deep = xx.nextInt();
    	
    	// 입력받기위한 for문
    	for (int i = 0; i < deep; i++) {
    		int re = xx.nextInt();
    		String str = xx.next();
    		
    		// 문자열 반복을 위한 for문
    		for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < re; j2++) {
					System.out.print(str.charAt(j));
				}
			}
    		System.out.println("");
		}
	}
}
