package sec01.exam01;

public class DiceRandom {

	public static void main(String[] args) {
		int sum = 0;
		int num1 = 0;
		int num2 = 0;

		do {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			sum = num1 + num2;
//			System.out.println(num1);
//			System.out.println(num2);
		} while (!(sum == 5));
			System.out.println(num1 + "," + num2);
	}

}
