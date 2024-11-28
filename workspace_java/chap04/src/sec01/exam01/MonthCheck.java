package sec01.exam01;

import java.util.Scanner;

public class MonthCheck {

	public static void main(String[] args) {
		System.out.print("오늘 달 수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int mon = scan.nextInt();
		
		if(mon >= 3 && mon <= 5) {
			System.out.println("봄이네요.");
		} else if (mon >= 6 && mon <= 8) {
			System.out.println("여름이네요.");
		} else if (mon >= 9 && mon <= 11) {
			System.out.println("가을이네요.");
		} else if (mon == 1 || mon == 2 || mon == 12) {
			System.out.println("겨울이네요.");
		} else {
			System.out.println("해당월에 계절을 찾지 못했어요!");
		}

	}

}
