import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    Scanner xx = new Scanner(System.in);
    
    int year = xx.nextInt();
    
    if(year%4==0 && year%100!=0)
    	System.out.println("1");
    else if(year%400==0)
    	System.out.println("1");
    else
    	System.out.println("0");
        
    }
}
