import java.util.Scanner; 
public class pyramid {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= 2 * i -1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


		for(int i = 1; i <=5; i++) {
			for(int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i -1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


		for(int i = 1; i <=5; i++) {
			for(int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
				for(int j = 1; j <= 2 * i -1; j++) {
					if(j == 1 || j == 2 * i - 1 || i == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}	


			System.out.println("");
		}		

		System.out.println("how many rows?");
		int rowNum = myScanner.nextInt();

		for(int i = 1; i <= rowNum; i++) {
			for(int k = 1; k <= rowNum - i; k++) {
				System.out.print(" ");
			}
				for(int j = 1; j <= 2 * i -1; j++) {
					if(j == 1 || j == 2 * i - 1 || i == rowNum) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}	


			System.out.println("");
		}	
	}
}