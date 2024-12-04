package sec01.exam01;

import java.util.Scanner;

public class multiple3 {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
//		for (int i = 1; i <= 20; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("------------------------");
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
////				sum += i;
//			}
//		}
		System.out.println("-----------1-------------");
		for (int i = 1; i <= 5; i++) {
			if ((i % 2 != 0)) {
				System.out.println(i + ": 홀수");
//				sum += i;
			} else if (i % 2 == 0) {
				System.out.println(i + ": 짝수");
//				sum += i;
			}
//		System.out.println("-----------1-1-----------");
//		String ea = "홀수";
//		if(i % 2 == 0) {
//			ea = "짝수";
//		}
//		System.out.println(i + " : "+ea);
//		
//		System.out.println("-----------1-2-----------");
//		ea = (i % 2 == 0)?"홀수":"짝수";
//		System.out.println(i + " : "+ea);
		}
		//홀수 합 구하기
		System.out.println("-----------2-------------");
		for (int i = 1; i <= 20; i++) {
			if ((i % 2 != 0)) {
				sum += i;	
			}
		}
		//홀수 개수 구하기
		System.out.println(sum);
		System.out.println("-----------3-------------");
		for (int i = 1; i <= 20; i++) {
			if ((i % 2 != 0)) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		System.out.println("-----------4-1------------");
		for (int i = 1; i <= 10; i++) {
			if(i<=2) {
				System.out.print(i);
				if(i==3) {
					System.out.println(i);
				}
			} else if(i>=4 && i<=5) {
				System.out.print(i);
				if(i==6) {
					System.out.println(i);
				}
			} else if(i>=7 && i<=8) {
				System.out.print(i);
				if(i==9) {
					System.out.println(i);
				}
			} else {
				System.out.println(i);
			}
			
		}
		//숫자 3열로 출력하기
		System.out.println("-----------4-2------------");
		for (int i = 1; i <= 10; i++) {
			if(i%3 != 0) {
				System.out.print(i);
			} else {
				System.out.println(i);
			}
			
		}
		System.out.println();
		
		//구구단 출력하기
		System.out.println("-----------5-------------");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		//구구단 가로로 출력하기
		System.out.println("-----------5-1------------");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j+" ");
			}
			System.out.println();
		}
		
		//구구단 두 단 출력하기
		System.out.println("-----------5-2------------");
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				if(i!=9) {
					System.out.print(i + " X " + j + " = " + i * j+" ");
					System.out.println((i+1)+ " X " + j + " = " + (i+1) * j+" ");
				}
			}
			System.out.println();
		}		
//		System.out.println("-----------5-3------------");
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				if(i%2==0) {
//					System.out.println(i + " X " + j + " = " + i * j+" ");
//				} else {
//					System.out.print(i + " X " + j + " = " + i * j+" ");
//				}
//			}
//			System.out.println();
//		}		
//		System.out.println("-----------6-------------");
//		//1부터 입력받은 n까지 합 구하기
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int n = scan.nextInt();
//		for (int i = 1; i <= n; i++) {
//			if ((i % 2 == 0)) {
//				sum += i;	
//			}
//		}
//		System.out.println(sum);

	}
}
