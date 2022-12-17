import java.util.Scanner;
public class Rhombus {

	public static void main(String[] args) {
		 Scanner myScanner = new Scanner(System.in);
		 System.out.println("how many rows?");
		 int rows = myScanner.nextInt();

		 for(int i = 1; i <= rows * 2; i++) {
		 	if(i <= rows) {
		 		for(int k = 1; k <= rows - i; k++) {
		 			System.out.print(" ");
		 		}
		 		for(int j = 1; j <= 2 * i - 1; j++) {
		 			if(j == 1 || j == 2 * i - 1) {
		 				System.out.print("*");	
		 			} else {
		 				System.out.print(" ");
		 			}
		 			
		 		}
		 		System.out.println("");
		 	} else {
		 		for(int k = 1; k <= i - rows; k++) {
		 			System.out.print(" ");
		 		}
				for(int j = 1; j <= -2 * (i - rows) + 2 * rows - 1; j++) {
					if(j == 1 || j == -2 * (i - rows) + 2 * rows - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println(""); 
			}
			
		 	}
	 }
}
