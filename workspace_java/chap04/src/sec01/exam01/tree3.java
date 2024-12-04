package sec01.exam01;

import java.util.Scanner;

public class tree3 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int scn = scan.nextInt();
		
		for(int i = 1; i<=scn; i++) {
			for(int j =1; j<= scn-i; j++) {
				System.out.print("_");
			}
			for(int k=1; k<=0+i; k++) {
				System.out.print("+");
			}
			for(int n=1; n<=0+i; n++) {
				if(n!=1) {
					System.out.print("+");
				}
			}
			for(int m=1; m<=scn-i; m++) {
				System.out.print("_");
			}
			System.out.println();
		}
	}

}
