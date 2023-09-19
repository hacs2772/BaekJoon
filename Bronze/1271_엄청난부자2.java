import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        BigInteger money = xx.nextBigInteger();
        BigInteger people = xx.nextBigInteger();        
    
        System.out.println(money.divide(people));
        System.out.println(money.remainder(people));
    }
}
