import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int deep = xx.nextInt();
        int[][] aa = new int[deep][deep];

        // 2차원 배열 입력 받는 for문
        for (int i = 0; i < deep; i++) {
            for (int j = 0; j < deep; j++) {
                aa[i][j] = xx.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        // 5번의 사이클 동안 배열을 움직이고 최댓값을 업데이트
        for (int cycle = 0; cycle < 5; cycle++) {
            // 왼쪽으로 이동하면서 합병
            aa = moveAndMerge(aa, deep, "left");
            max = Math.max(max, findMaxValue(aa));

            // 오른쪽으로 이동하면서 합병
            aa = moveAndMerge(aa, deep, "right");
            max = Math.max(max, findMaxValue(aa));

            // 위쪽으로 이동하면서 합병
            aa = moveAndMerge(aa, deep, "up");
            max = Math.max(max, findMaxValue(aa));

            // 아래쪽으로 이동하면서 합병
            aa = moveAndMerge(aa, deep, "down");
            max = Math.max(max, findMaxValue(aa));
        }

        // 최종 결과 출력
        System.out.println(max);
    }

    // 배열 내에서 최댓값을 찾는 함수
    private static int findMaxValue(int[][] board) {
        int max = Integer.MIN_VALUE;

        for (int[] row : board) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    // 배열을 특정 방향으로 이동하고 합병하는 함수
    private static int[][] moveAndMerge(int[][] board, int size, String direction) {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            switch (direction) {
                case "left":
                    result[i] = moveAndMergeLeft(board[i]);
                    break;
                case "right":
                    result[i] = moveAndMergeRight(board[i]);
                    break;
                case "up":
                    result[i] = moveAndMergeUp(board, size, i);
                    break;
                case "down":
                    result[i] = moveAndMergeDown(board, size, i);
                    break;
            }
        }

        return result;
    }

    // 왼쪽으로 이동하면서 합병
    private static int[] moveAndMergeLeft(int[] row) {
        int[] result = new int[row.length];
        int idx = 0;

        for (int value : row) {
            if (value != 0) {
                if (result[idx] == 0) {
                    result[idx] = value;
                } else if (result[idx] == value) {
                    result[idx] *= 2;
                    idx++;
                } else {
                    idx++;
                    result[idx] = value;
                }
            }
        }

        return result;
    }

    // 오른쪽으로 이동하면서 합병
    private static int[] moveAndMergeRight(int[] row) {
        int[] result = new int[row.length];
        int idx = row.length - 1;

        for (int i = row.length - 1; i >= 0; i--) {
            int value = row[i];
            if (value != 0) {
                if (result[idx] == 0) {
                    result[idx] = value;
                } else if (result[idx] == value) {
                    result[idx] *= 2;
                    idx--;
                } else {
                    idx--;
                    result[idx] = value;
                }
            }
        }

        return result;
    }

    // 위쪽으로 이동하면서 합병
    private static int[] moveAndMergeUp(int[][] board, int size, int col) {
        int[] result = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            int value = board[i][col];
            if (value != 0) {
                if (result[idx] == 0) {
                    result[idx] = value;
                } else if (result[idx] == value) {
                    result[idx] *= 2;
                    idx++;
                } else {
                    idx++;
                    result[idx] = value;
                }
            }
        }

        return result;
    }

    private static int[] moveAndMergeDown(int[][] board, int size, int col) {
        int[] result = new int[size];
        int idx = size - 1;

        for (int i = size - 1; i >= 0; i--) {
            int value = board[i][col];
            if (value != 0) {
                if (result[idx] == 0) {
                    result[idx] = value;
                } else if (result[idx] == value) {
                    result[idx] *= 2;
                    idx--;
                } else {
                    idx--;
                    result[idx] = value;
                }
            }
        }

        return result;
    }
}
