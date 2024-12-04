package sec01.exam01;

import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
		int [] arr = {3,4,7,5,1,4,6};
//		int cntt = 0;
//		
//		// 1번 문제
//		for(int i=0; i<= arr.length-1; i++) {
//			if(arr[i] % 2 != 0) {
//				cntt += 1;
//			}
//		}
//		System.out.println(cntt);
//		//2번 문제
//		int cnt = 0;
//		for(int j=0; j<= arr.length-1; j++) {
//			if(arr[j] > 4) {
//				cnt += 1;
//			}
//		
//		}
//		System.out.println(cnt);
//		
		//3번문제
//		int [] ar = new int[7];
		int swp = 0;
//		int ar = 0;
//		int mar = 0;

		for(int k=0; k<= arr.length-1; k++) {
			for(int m = k; m <= arr.length-1; m++) {
				if(arr[k] > arr[m]) {	
					swp = arr[m]; //작은거
					arr[m] = arr[k];
					arr[k] = swp; 
//					System.out.print("k :"+arr[k]+" "+"K숫자 : "+k+" ");// 큰거
//					System.out.println("m :"+arr[m]+" "+"m숫자 : "+m);// 작은거
				} 
			}
			
		} System.out.println(arr[arr.length-1]);
		
		//4번 문제
		for(int k=0; k<= arr.length-1; k++) {
			for(int m = k; m <= arr.length-1; m++) {
				if(arr[k] > arr[m]) {	
					swp = arr[m]; //작은거
					arr[m] = arr[k];
					arr[k] = swp; 
//					System.out.print("k :"+arr[k]+" "+"K숫자 : "+k+" ");// 큰거
//					System.out.println("m :"+arr[m]+" "+"m숫자 : "+m);// 작은거
				} 
			}
			
		} System.out.println(arr[arr.length-2]);
		
		// 5-1번 문제		
		int[] a = {1,2,3,4};
		
		for(int k=0; k<= a.length-1; k++) {
			a[k] = 0;
			System.out.print(a[k]+" ");
		}
		System.out.println();
		// 5-2번 문제
		int[] aa = {1,2,3,4};
		int swp1 = 0;
		
		for(int k=0; k<= aa.length-1; k++) {
			if(aa[k]==4) {
				swp1 = aa[k];
				aa[k] = aa[k-3];
				aa[0]= swp1;
			}
		}
		System.out.println();
		
		// 6-1 숫자로 임시비밀번호 8자리 만들기
//		int pwd = (int) (Math.random() * 60);
//		int [] pwds = new int[8];
//		
//		for(int y = 0; y <= pwds.length-1; y++) {
//			pwds[y] = (int) (Math.random() * 60);
//			System.out.print(pwds[y]+" "); 
//		}
//		System.out.println();
//		
		// 6-2 소문자로 임시비밀번호 8자리 만들기
		char [] pwds2 = new char[8];
		int rnd = 0;
		for(int y = 0; y <= pwds2.length-1; y++) {
			rnd = (int) (Math.random() * 100); 
			if( 97 <= rnd && rnd <= 122) {
				pwds2[y] = (char)rnd;
//				System.out.println(rnd);
			}
			System.out.print(pwds2[y]+" "); 
		}
		System.out.println();	
		// 6-3 숫자 2개 이상 + 대소문자로 임시비밀번호 8자리 만들기
		char[] pwds3 = new char[8];
		int rnd1 = 0;
		for(int y = 0; y <= pwds3.length-1; y++) {
			rnd1 = (int) (Math.random() * 100); 
			if((65 <=rnd1 && rnd1 <= 90) && (97 <=rnd1 && rnd1 <= 122)) {
				pwds3[y] = (char)(int)rnd1;
				System.out.println(rnd1);
			}
			System.out.print(pwds3[y]+" "); 
		}
		System.out.println();
		
//		// 7. 예약
//		int site = 0;
//		int d = 0;
//		Scanner scan = new Scanner(System.in);
//		int cnt = 0;
//		int [] rsv = new int[10];
//		int sys = 0;
//		do {
//			site = (int) (Math.random() * 10)+1;
//			rsv[0] = 1;
//			
//			System.out.println("1.예약 2.모든좌석현황 3.잔여좌석 4.종료");
//			sys = scan.nextInt();
//			
//			if(sys == 1) {
//				System.out.print("예약할 좌석을 입력해주세요.");
//				int ans = scan.nextInt();
//				
//				for(int i=0; i<=10; i++) {
//					if (rsv[i]== ans) {
//						d = i;
//						System.out.println("이미 예약된 좌석입니다.");
//						break;		
//					} else {
//						rsv[d] = ans;
//						System.out.println(ans+"번자리 예약 했습니다.");
//						break;
//					}
//				} 
//	
//			}
//			if(sys == 2) {
//				for(int i=0; i<=10; i++) {
//					if(rsv[i] > 0) {
//						System.out.print(rsv[i]+"번 자리 예약불가");
//					} else {
//						System.out.print(rsv[i]+"번 자리 예약가능");
//					}
//				}
//			}
//			if(sys == 3) {
//				for(int i=0; i<=10; i++) {
//					if(rsv[i] > 0) {
//						cnt += 1;
//					}
//				
//				}
//			System.out.println((rsv.length-1)+"자리 남았습니다.");
//			}
//		} while(!(sys == 4));
//		
//		
//		// 8.로또
//		
//		int[] lotto = new int[6];
//		
//		for (int i = 0; i < 6; i++) {
//
//			int lnum = 0;
//			int nnum = (int) (Math.random() * 50);  
//
//			if (lnum == nnum || nnum == 0) {// 이전번호와 뽑은 번호가 같거나 0이 나오면
//				lnum = nnum;
//				i--;
//			} else {
//				lotto[i] = nnum;
//				System.out.print(nnum + " ");				
//			}
//		}
//
	}

}
