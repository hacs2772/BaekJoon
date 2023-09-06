import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner xx = new Scanner(System.in);
		int deep = xx.nextInt();
		int[] arr = new int[deep];
		
		// 깊이만큼 테스트케이스를 입력받을 수 있음
		for (int i = 0; i < deep; i++) {
			arr[i] = xx.nextInt();
		}
		
		int search = xx.nextInt();
		int result = Bridge(arr, search);
		System.out.println(result);
    }
	
	static int Bridge(int[] arr, int search) {
		int count = 0;
        
        for (int i = 0; i < arr.length; i++) {	// 배열 길이만큼 돈다
			
			if (arr[i] == search) {		// 배열 인덱스 i와 입력받은 search와 비교하여 같으면 count++ 수행한다.
                count++;
            }
        }
		return count;
	}
}
