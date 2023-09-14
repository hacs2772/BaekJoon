import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int hour = xx.nextInt();
        int min = xx.nextInt();
        
        min -= 45;
        
        // 분이 음수인 경우 시간을 조정한다
        if (min < 0) {
            hour -= 1; // 시간을 1시간 빼준다.
            min += 60; // 분을 60분 더해준다.(그래야 음수가 양수로 바뀌니까)
        }
        
        // 시간이 음수인 경우 24를 더해준다.(자정을 지나간 경우)
        if (hour < 0) { 
            hour += 24;
        }
        System.out.println(hour + " " + min);
    }
}
