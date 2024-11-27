package sec02.exam04;

public class Quiz2 {

	public static void main(String[] args) {
		int tea = 5000;
		int lip = 30000;
		double sale = 0.85;
		System.out.println("꿀홍자 값 : "+(int)(tea*sale)+"원");
		System.out.println("꿀홍자와 립스틱 값 : "+(int)((tea+lip)*sale)+"원");

		int m = 7234;
		int och = 5000;
		int chw = 1000;
		int obw = 500;
		int bw = 100;
		int sw = 10;
		int il = 1;
		
		System.out.println("오천원 : "+m/och+"장");
		System.out.println("천원 : "+(m%och)/chw+"장");
		System.out.println("오백원 : "+((m%och)%chw)/obw+"장");
		System.out.println("백원 : "+(((m%och)%chw)%obw)/bw+"장");
		System.out.println("십원 : "+((((m%och)%chw)%obw)%bw)/sw+"장");
		System.out.println("일원 : "+((((m%och)%chw)%obw)%sw)/il+"장");
		
	}

}
