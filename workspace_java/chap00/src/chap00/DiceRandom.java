package chap00;

public class DiceRandom {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		int sum = num1+num2;
		
		while(sum == 5) {
			break;
		}
		System.out.println(num1+","+num2);
		
	}

}
