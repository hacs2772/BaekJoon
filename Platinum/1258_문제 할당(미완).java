import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        // 입력받을 학생 수 N
        int n = scanner.nextInt();

        int[][] time = new int[n][n];

        // 각 학생이 각 문제를 풀 때 걸리는 시간을 입력받는 구간
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                time[i][j] = scanner.nextInt();
            }
        }

        int minTime = minTotalTime(time);
        // 최종 최소시간 출력
        writer.println(minTime);

        scanner.close();
        writer.close();
    }

    public static int minTotalTime(int[][] time) {
        int n = time.length;
        int[] dp = new int[1 << n]; // 비트마스크를 사용하여 모든 학생의 할당 상태를 나타냄
        Arrays.fill(dp, -1); // 초기값을 -1로 설정

        // 비트마스크 DP를 이용하여 최소 시간 계산
        return calculateMinTime(0, 0, time, dp);
    }

    private static int calculateMinTime(int mask, int student, int[][] time, int[] dp) {
        int n = time.length;

        if (mask == (1 << n) - 1) {
            return 0; // 모든 학생이 할당되었을 때, 시간이 0
        }

        if (dp[mask] != -1) {
            return dp[mask]; // 이미 계산된 값이 있는 경우, 그 값을 반환
        }

        int minTime = Integer.MAX_VALUE;

        for (int problem = 0; problem < n; problem++) {
            if ((mask & (1 << problem)) == 0) {
                int newMask = mask | (1 << problem);
                int timeWithCurrentAssignment = time[student][problem] + calculateMinTime(newMask, student + 1, time, dp);
                minTime = Math.min(minTime, timeWithCurrentAssignment);
            }
        }

        dp[mask] = minTime; // 결과를 저장
        return minTime;
    }
}
