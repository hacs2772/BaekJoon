public class Main{
	public static void main(String[] args){
		
		Scanner xx = new Scanner(System.in);
		 
		int deep = xx.nextInt();
 
		while (deep-- > 0) {
 
			int x1 = xx.nextInt();
			int y1 = xx.nextInt();
			int r1 = xx.nextInt();
 
			int x2 = xx.nextInt();
			int y2 = xx.nextInt();
			int r2 = xx.nextInt();
			
			System.out.println(hacs(x1, y1, r1, x2, y2, r2));
		}
    }
	public static int hacs(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int re = (int) Math.pow((r2-r1),2);		// double로 하면 오류가 난다
		int rez = (int) Math.pow((r2+r1),2);
		int le = (int) (Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if (rez < le) {	// 멀리 떨어져있는 원 2개인 경우
			return 0;
		} else if (re == le) {	// 원이 내접할때
			return 1;
		} else if (le < re) {		// 원안에 원이 있을 경우
			return 0;
		} else if (rez == le) {		// 원이 외접할때
			return 1;
		}
		return 2;
	}
}
