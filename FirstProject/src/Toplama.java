import java.util.Scanner;


public class Toplama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("birinci sayiyi giriniz");
		
		int x = input.nextInt();
		
		System.out.println("ikinci sayiyi giriniz");
		
		int y = input.nextInt();
		
		System.out.printf("%s ve %s'nin toplami " +topla(x,y)+" dir",x,y);
		
		
		
		

	}
	
	public static int topla(int x, int y){
		
		return x + y;
		
	}

}
