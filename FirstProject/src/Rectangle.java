import java.util.Scanner;


public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter width of the rectangle");
		
		int w = sc.nextInt();
		
		System.out.println("please enter height of the rectangle ");
		
		int h = sc.nextInt();
		
		
		
			for (int i=0 ; i < h; i++) {
				
				if(i==0){
					
					for(int j=0;j<w;j++){
				
					System.out.print("* ");
					
				}
					System.out.println();
					
					
					
				}else if(i==h-1){
					
			
					for(int j=0;j<w;j++){
						
						System.out.print("* ");

				}
					
					}else{
						for(int j=0;j<w;j++){
							
							if(j==0||j==w-1){
								System.out.print("* ");
							}
							else{
								System.out.print("  ");
							}
						
						
							
							}
						System.out.println();

					}
			}
				
	}
}

				
		
				

