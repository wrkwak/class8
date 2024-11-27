package sec02.exam04;

public class Arr {

	public static void main(String[] args) {
		int m = 7234;
		int rslt = 0;
		int[] unitm = { 5000, 1000, 500, 100, 50, 10, 1 };

		for (int i = 0; i < unitm.length; i++) {

			rslt = m / unitm[i];
			System.out.println(unitm[i] + " : " + rslt);
			m %= unitm[i];

		}

	}
}