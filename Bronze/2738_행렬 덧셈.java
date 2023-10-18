import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);
    	int deep = xx.nextInt();
    	int deep2 = xx.nextInt();
    	int[][] aa = new int[deep][deep2];
    	int[][] bb = new int[deep][deep2];
    	
    	// 첫번째 행렬A 입력받기
    	for (int i = 0; i < deep; i++) {
    		for (int j = 0; j < deep2; j++) {
				aa[i][j] = xx.nextInt();
			}
		}
    	// 두번재 행렬B 입력받음에 동시에 A와 더하기
    	for (int i = 0; i < deep; i++) {
    		for (int j = 0; j < deep2; j++) {
				bb[i][j] = xx.nextInt();
				aa[i][j] += bb[i][j];
			}
		}
    	// A행렬 출력하기
    	for (int i = 0; i < deep; i++) {
            for (int j = 0; j < deep2; j++) {
                System.out.print(aa[i][j] + " ");
            }
            // 다음 줄로 넘어감
            System.out.println();
        }
	}
}
