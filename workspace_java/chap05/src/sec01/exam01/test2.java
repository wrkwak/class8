package sec01.exam01;

public class test2 {

	public static void main(String[] args) {
		// 6-2 소문자로 임시비밀번호 8자리 만들기
		char [] pwds2 = new char[8];
		int rnd = 0;
		for(int y = 0; y <= pwds2.length-1; y++) {
			rnd = (int) (Math.random() * 140); 
			if( 97 <= rnd && rnd <= 122) {
				pwds2[y] = (char)rnd;
			}
			System.out.print(pwds2[y]+" "); 
		}
}
}