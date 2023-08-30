import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner xx = new Scanner(System.in);
        
        int yy = xx.nextInt();
        String two = Integer.toBinaryString(yy);	// 2진수로 변환
        
        int countOne = SearchOne(two);
        
        System.out.println(countOne);
        
        xx.close();
    }
    
    public static int SearchOne(String two) {	// 주어진 스트링에 "1"의 개수를 카운트하는 메소드
        int count = 0;
        
        for (int i = 0; i < two.length(); i++) {	// 스트링 길이만큼 돈다
            if (two.charAt(i) == '1') {		// "1"을 카운트 한다
                count++;
            }
        }
        return count;
    }
}
