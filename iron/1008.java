import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner xx = new Scanner(System.in);

        double x = xx.nextDouble();
        double y = xx.nextDouble();

        System.out.print(x/y);

        xx.close();
    }
}
