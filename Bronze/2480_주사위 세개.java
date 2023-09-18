import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int ff = xx.nextInt();
        int ss = xx.nextInt();
        int tt = xx.nextInt();
        int result = 0;
        
        // 모두 같은 눈
        if (ff == ss && ff == tt && ss == tt) {
			result = 10000+(ff*1000);
		}
        // 모두 다른 눈
        if (ff != ss && ff != tt && ss != tt) {
        	int max = Math.max(ff, Math.max(ss, tt));
        	result = max*100;
		}
        
        // 같은 눈이 2개만 나오는 경우
        if (ff == ss && ff != tt) {
            result = 1000 + (ff * 100);
        }else if (ff == tt && ff != ss) {
        	result = 1000 + (ff * 100);
		}else if (ss == tt && ss != ff) {
			result = 1000 + (tt * 100);
		}
        
        
        System.out.println(result);
    }
}
