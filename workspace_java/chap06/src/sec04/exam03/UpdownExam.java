package sec04.exam03;

import java.util.Scanner;

public class UpdownExam {
	
	public static void main(String[] args) {
		int msg=5;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		Updown ud = new Updown();
		 
		// TODO Auto-generated method stub
//		ud.ans();
		while(cnt < 5) {
			System.out.println();
			System.out.println("업다운게임을 시작합니다.");
			System.out.println("숫자를 맞춰보시오. 남은기회는 총 "+msg+"회.");
			int ans = scan.nextInt();
			ud.ptry(ans,msg);
			if(ans != ud.rnd) {
				cnt++;
				msg--;
			} else if(ans == ud.rnd) {
				cnt = 6;
				System.out.println("플레이어가 이겼습니다.");
			} 
		}
		
	}

}
