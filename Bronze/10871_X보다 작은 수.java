import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        int max = xx.nextInt();
        int[] nums = new int[deep];
        StringBuilder result = new StringBuilder();

        // 깊이만큼 테스트케이스를 입력받을 수 있음
        for (int i = 0; i < deep; i++) {    // 배열 입력받는 포문
            nums[i] = xx.nextInt();
            if (max > nums[i]) {
                if (result.length() > 0) {
                    result.append(" "); // 이미 요소가 추가된 경우 띄어쓰기 추가
                }
                result.append(nums[i]); // 요소 추가
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }
}
