package sec01.exam01;

import java.util.Scanner;

public class BankAcount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출금할 금액을 입력하세요 : ");
		int mny = scan.nextInt();
		
		int bmny = 10000;

		int brnch = 0;
		String msg1 = "";
		String msg2 = "";
		String msg3 = "";

		if (mny > bmny) {
			brnch = 1;
			msg1 = "잔액이 부족합니다ㅋㅋ;";
		} else if (mny < 0) {
			brnch = 2;
			msg2 = "금액을 정확히 입력하세요 ㅡㅡ";
		} else {
			brnch = 3;
			msg3 = (mny + "원 출금했고 " + (bmny-mny) + "원 남았습니다.");
		}
		

		switch (brnch) {
		case 1:
			System.out.println(msg1);
			break;
		case 2:
			System.out.println(msg2);
			break;
		case 3:
			System.out.println(msg3);
		}
	}

}
