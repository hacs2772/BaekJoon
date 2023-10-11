import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner xx = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rooks = 2;
        int bishops = 2;
        int knights = 2;
        int pawns = 8;
        
        king = king - xx.nextInt();
        queen = queen -xx.nextInt();
        rooks = rooks - xx.nextInt();
        bishops = bishops - xx.nextInt();
        knights = knights - xx.nextInt();
        pawns = pawns - xx.nextInt();
        
        System.out.println(king + " " + queen + " " + rooks + " " + bishops + " " + knights + " " + pawns);
	} 
}
