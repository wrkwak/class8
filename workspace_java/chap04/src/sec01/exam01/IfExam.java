package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
//		int score = 96;
//		Scanner scan = new Scanner(System.in);
////		int score = scan.nextInt();
//
////		if (score >= 90) {
////			System.out.println("점수가 90보다 큽니다.");
////			System.out.println("등급은 A입니다.");
////		}
////
////		if (score < 90) {
////			System.out.println("점수가 90보다 작습니다.");
////			// 중괄호가 없는경우 if문 아래줄까지만 적용
////			System.out.println("등급은 B입니다.");
////
////		}
//
////		if (score >= 90) {
////			System.out.println("점수가 90점 이상입니다.");
////			System.out.println("등급은 A");
////
////		} else {
////			System.out.println("점수가 90점 미만입니다.");
////			System.out.println("등급은 B");
////		}
////
////		if (score >= 90) {
////			System.out.println("점수가 90점 이상입니다.");
////			System.out.println("등급은 A");	
////		} else if (score < 90 && score >= 80){
////			System.out.println("점수가 80점 이상입니다.");
////			System.out.println("등급은 B");
////		} else if (score < 80 && score >= 70){
////			System.out.println("점수가 70점 이상입니다.");
////			System.out.println("등급은 B");
////		} else {
////			System.out.println("점수가 70점 미만입니다.");
////			System.out.println("등급은 D");
////		}
////
////		if (score >= 90) {
////			System.out.println("90점 이상입니다");
////
////			if (score >= 95) {
////				System.out.println("95점 이상입니다");
////			}
////		}
//
////		// 문제 1.
////		// z1이 x1과 y1 사이에 있는지 확인
////		int x1 = 15;
////		int y1 = 20;
////		int z1 = 17;
////		
////		if (z1 > x1 && z1 < y1) {
////			System.out.println("중간에 있습니다");
////		} else {
////			System.out.println("중간에 없습니다");
////		}
////
////		int x2 = 3;
////		if(x2 % 2 == 0) {
////			System.out.println("짝수");
////		} else {
////			System.out.println("홀수");
////		}
//
//		// 문제 2
//		/*
//		 * 어제 온도가 -3도 였을때 오늘 온도(입력 가능)가
//		 * 
//		 * "영하"인지 "영상"인지 만약 영하라면 "영하 1도 입니다" 영상이라면 "영상 2도 입니다"
//		 * 
//		 * "어제보다 온도가 높습니다" "어제보다 온도가 낮습니다"
//		 * 
//		 */
//
//		int ltmp = -3;
//		
//	    System.out.println("어제온도 : "+ltmp+"도");
//		System.out.print("오늘 온도를 입력하세요 : ");
//		
//		int ttmp = scan.nextInt();
//		String utm = "영상";
//		String dtm = "영하";
//
//		String utmsg = "어제보다 온도가 높습니다.";
//		String dtmsg = "어제보다 온도가 낮습니다.";
//
//		if (ttmp < 0) {// 영하인 상황
//			if (ltmp < ttmp) { // 어제 온도가 오늘 온도보다 낮아
//				System.out.println(dtm + ttmp + "도 입니다.");
//				System.out.println(utmsg);
//			} else {
//				System.out.println(dtm + ttmp + "도 입니다.");
//				System.out.println(dtmsg);
//			}
//		} else if (ttmp >= 0) {// 영상인 상황
//			if (ltmp < ttmp) { // 어제 온도가 오늘 온도보다 높아
//				System.out.println(utm + ttmp + "도 입니다.");
//				System.out.println(utmsg);
//			} else {
//				System.out.println(utm + ttmp + "도 입니다.");
//				System.out.println(dtmsg);
//			}
//
//		}
//		
//		 System.out.println();
//
//		////////////////
//		// 문제 3
//		/*
//		 * 어떤 수가 있을때
//		 * 
//		 * "입력한 수는 100보다 큰/같은/작은 수이며 양수이고 홀수입니다"
//		 */
//	    System.out.print("숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		String pnum = "양수";
//		String mnum = "음수";
//		String evnum = "짝수";
//		String odnum = "홀수";
//
//		if (num < 100) {// 100보다 작은 상황
//			if (num >= 0) {// 양수
//				if (num % 2 == 0) {// 짝수
//					System.out.println("입력한 수는 100보다 작은 수 이며 " + pnum + "이고 " + evnum + "입니다.");
//				} else {
//					System.out.println("입력한 수는 100보다 작은 수 이며 " + pnum + "이고 " + odnum + "입니다.");
//				}
//			} else if (num < 0) {// 음수
//				if (num % 2 == 0) {// 홀수
//					System.out.println("입력한 수는 100보다 작은 수 이며 " + mnum + "이고 " + evnum + "입니다.");
//				}else {
//					System.out.println("입력한 수는 100보다 작은 수 이며 " + mnum + "이고 " + odnum + "입니다.");
//				}
//			}
//		} else if (num == 100) {// 100하고 같은 상황
//			System.out.println("입력한 수는 100과 같은 수 입니다.");
//		} else if (num > 100) {// 큰 상황
//			if (num % 2 == 0) {// 짝수
//				System.out.println("입력한 수는 100보다 작은 수 이며 " + pnum + "이고 " + evnum + "입니다.");
//			}
//		} else {
//			System.out.println("입력한 수는 100보다 작은 수 이며 " + pnum + "이고 " + odnum + "입니다.");
//		}
//		
//		 System.out.println();
//		 
//		// 문제 4
//		/*
//		 * a, b 두 수가 있을때
//		 * 둘중에 큰 값 출력
//		 */
//		System.out.print("a를 입력하세요 : ");
//		int a = scan.nextInt();
//		System.out.print("b를 입력하세요 : ");
//		int b = scan.nextInt();
//		int bignum = 0;
//		
//		if(a > b) {
//			bignum = a;
//			System.out.println("둘 중에 더 큰 수는 "+bignum+"입니다.");
//		} else if(a < b) {
//			bignum = b;
//			System.out.println("둘 중에 더 큰 수는 "+bignum+"입니다.");
//		} else {
//			System.out.println("두 수가 같습니다.");
//		}
//		
//		 System.out.println();
//		 
//		// 문제 5
//		/*
//		 * 숫자가
//		 * 1일때 "일"
//		 * 2일때 "이"
//		 * 3일때 "삼"
//		 * 다른 수일때 "그 외"
//		 */
//		System.out.print("숫자를 입력하세요 : ");
//		int nm = scan.nextInt();
//		
//		if(nm == 1) {
//			System.out.println("일");
//		} else if(nm == 2) {
//			System.out.println("이");
//		} else if(nm == 3) {
//			System.out.println("삼");
//		} else {
//			System.out.println("그 외");
//		}
//		
//		 System.out.println();		
//		
//		// 문제 6
//		/*
//		 * 월에 따라서
//		 * 4계절을 출력
//		 * 봄 : 3,4,5
//		 * 여름 : 6,7,8
//		 * 가을 : 9, 10, 11
//		 * 겨울 : 12, 1, 2
//		 */
//		
//		System.out.print("오늘 달 수를 입력하세요 : ");
//		int mon = scan.nextInt();
//		
//		if(mon >= 3 && mon <= 5) {
//			System.out.println("봄이네요.");
//		} else if (mon >= 6 && mon <= 8) {
//			System.out.println("여름이네요.");
//		} else if (mon >= 9 && mon <= 11) {
//			System.out.println("가을이네요.");
//		} else if (mon == 1 || mon == 2 || mon == 12) {
//			System.out.println("겨울이네요.");
//		} else {
//			System.out.println("해당월에 계절을 찾지 못했어요!");
//		}
//		
//		//두자리 정수가 10의 자리와 1의 자리가 같은지 판단
//		System.out.print("두 자리 숫자를 입력하세요 : ");
//		int nmbr = scan.nextInt();
//		int sprt10 = nmbr/10;
//		int sprt1 = nmbr%10;
//		
//		if(sprt10 == sprt1) {
//			System.out.println("십의 자리와 일의 자리의 수가 같습니다.");
//		} else {
//			System.out.println("십의 자리와 일의 자리의 수가 같지 않아요!");
//		}
//		
//		 System.out.println();	
//		 
//		//사각형의 한쪽 모서리: xa: 10, ya: 20
//		//다른쪽 모서리 : xb : 90, yb : 100
//		// 새로운 점 : xc, yc가 사각형에 포함되는가?
//		
//		int xa = 10;
//		int ya = 20;
//		int xb = 90;
//		int yb = 100;
//		
//		System.out.print("xc 값을 입력하세요 :");
//		int xc = scan.nextInt();
//		System.out.print("yc 값을 입력하세요 :");
//		int yc = scan.nextInt();
//		
//		if((xa <= xc && xc <= xb) && (ya <= yc && yc <= yb)) {
//			System.out.println("포함됩니다.");
//		} else {
//			System.out.println("포함되지 않습니다.");
//		}
//		
//		//random 사용법
//		/*
//		 * Math.random() 함수의 범위
//		 * 0 <= Math.random() < 1 
//		 * 
//		 * */
//		int rnd = (int) (Math.random()*50);
//		int inrdm = (int)(rnd * 50);
//		System.out.println(inrdm);
//		
		// 로또 demo
		// TODO
		for (int i = 0; i < 6; i++) {

			int lnum = 0;
			int nnum = (int) (Math.random() * 50);  

			if (lnum == nnum || nnum == 0) {// 이전번호와 뽑은 번호가 같거나 0이 나오면
				lnum = nnum;
				i--;
			} else {
				System.out.print(nnum + " ");				
			}
		}

		System.out.println();

		// 가위 바위 보
		// 1= 가위 2= 바위 3= 보
//		System.out.print("가위 바위 보! : ");
//		Scanner scn = new Scanner(System.in);
//		String ply = scn.next();

		String ply = "바위";
		int pln = 0;

		if (ply == "가위") {
			pln = 1;
		} else if (ply == "바위") {
			pln = 2;
		} else if (ply == "보") {
			pln = 3;
		}

		int rpc = (int) (Math.random() * 3 + 1);
//		System.out.println(rpc);
		System.out.println("플레이어 : " + ply);
		if (rpc == 1) {// 가위
			System.out.println("pc : 가위");
			if (pln == 1) {
				System.out.println("비겼습니다.");
			} else if (pln == 2) {
				System.out.println("플레이어가 이겼습니다.");
			} else if (pln == 3) {
				System.out.println("플레이어가 졌습니다.");
			}

		} else if (rpc == 2) {// 바위
			System.out.println("pc : 바위");
			if (pln == 1) {
				System.out.println("플레이어가 졌습니다.");
			} else if (pln == 2) {
				System.out.println("비겼습니다.");
			} else if (pln == 3) {
				System.out.println("플레이어가 이겼습니다.");
			}

		} else if (rpc == 3) {// 보
			System.out.println("pc : 보");
			if (pln == 1) {
				System.out.println("플레이어가 이겼습니다.");
			} else if (pln == 2) {
				System.out.println("플레이어가 졌습니다.");
			} else if (pln == 3) {
				System.out.println("비겼습니다.");
			}
		}

//		int nnnn = (int) (Math.random() * 60);
//		System.out.println(nnnn%6+1);

	}
}
	
