package sec01.exam01;

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
		}
		System.out.println("-----------2-------------");
		for (int i = 1; i <= 20; i++) {
			if ((i % 2 != 0)) {
				sum += i;	
			}
		}
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
		System.out.println("-----------4-2------------");
		for (int i = 1; i <= 10; i++) {
			if(i%3 != 0) {
				System.out.print(i);
			} else {
				System.out.println(i);
			}
			
		}
		System.out.println();
		System.out.println("-----------5-------------");
		for (int i = 2; i <= 2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j);
				System.out.println();
			}

		}

	}
}
