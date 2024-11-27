package sec01.exam02;

public class RandomQuiz {

	public static void main(String[] args) {
		String a = "수박";
		String b = "볼링공";
		String temp = "";
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println(a); // 볼링공
		System.out.println(b); // 수박

	}

}
