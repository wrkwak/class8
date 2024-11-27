package sec01.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {
		
		int a = 10;
		long b = (long)a; // type casting operator라고 한다.
		          //()는 형변환 우선 연산자
		
		
		long d = 3000000000L;
		int e = (int)d;
		System.out.println(e);
		// long을 int로 변환하는 경우 
		// 8byte 중에서 상위 4byte만 남기기 때문에 
		// 예측하지 못한 값이 나올 수 있어서 잘 안씀
		
		int g = 3;
		long h = 4L;
//		int i = g+h;
		// 큰걸로 자동 형변환을 해줌
		
//		int는 double로 자동 형변환
		double j = -3.3;
		System.out.println((int)j);
		
		double total = 4.3; //토탈
		int cnt = 4;
		int sub = (int)total/cnt;
		double main =  total-sub*(cnt-1);
		System.out.println("참여자가 낼 금액 : " + sub);
		System.out.println("주최자가 낼 금액 : " + main);
		

		
//		System.out.println((int)total/4);
//		System.out.println((double)total/4);
	}

}
