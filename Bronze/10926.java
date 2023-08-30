import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner xx = new Scanner(System.in);

        int x = xx.nextInt();
        int y = xx.nextInt();

        System.out.print(x * y);

        xx.close();
    }
}
