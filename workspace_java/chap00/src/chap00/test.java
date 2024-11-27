package chap00;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";		
		String t = "";		

		for (int i = 0; i <= 3 ; i++) {
			s += "*";
			t = String.format("%4s", s);
			System.out.println(t);
		}
	}
}