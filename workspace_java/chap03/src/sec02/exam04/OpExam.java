package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
		
//		boolean a = false;
//		System.out.println("a : "+a);
//		
//		a = !a;
//		System.out.println("a : "+a);
//		
//		double b = 7.0;
//		System.out.println("b : "+ b/3);
//		
//		System.out.println("b : "+ b/0);
		//int를 0으로 나누면 "/by zero" 에러
//		
//		double c = 7.0;
//		System.out.println("7/0 = "+c/0);
//		//Infinity 에러
//		
//		int cc = 9684321;
//		int dd = 5;
//		System.out.println("몫 : "+(cc/dd));
//		System.out.println("나머지 : "+(cc%dd));
//		String str3 = "jdk"+3+3.0;
//		System.out.println(str3);
		
//		System.out.println(""+3+3.0); //강제형변환 : 숫자 -> 문자
//		
//		String c2 = "100";
//		int c3 = Integer.parseInt(c2);
//		System.out.println(c3+1); //강제형변환 : 문자 -> 숫자  
		
//		boolean b = 3>5;
//		System.out.println(b);//false
//		System.out.println(1==1);//true
//		System.out.println(1==1.0);//true
//		System.out.println(1.0f==1.0);//true
//	    		
//		System.out.println(0.1==0.1f);//false
//		System.out.println((float)0.1==0.1f);//true
//		//소수점 이하는 정확하지 않아서 
//		//0.1을 0.099999 또는 0.100000000001로 처리할 수 있기 때문에
//		//같은 타입으로 변환해서 비교하자
//		
//		System.out.println('C' < 'J');//true
////		System.out.println("ac"<"ac");//ERROR String 형태는 안됨
//		System.out.println(" 3 != 3 : "+ (3 != 3));
		
//		String s1 = "곽우림";
//		String s2 = "곽우림";
//		System.out.println(s1==s2);
//		//글씨 비교는 == 사용금지
//		
//		//String 비교방법
//		System.out.println(s1.equals(s2));
//		System.out.println("곽우림".equals(s2));
//		
//		System.out.println(!"곽우림".equals(s2));
//		System.out.println(!s1.equals(s2));
//		//String 변수 또는 "글씨".equals(비교값)
//		
//		int i1 = 87;
//		System.out.print(i1+"은 B학점인가? ");
//		if((i1 >= 80) && (i1 < 90)) {
//			System.out.println("그렇다");
//			};
//		System.out.println((i1 >= 80) || (i1 < 90));
		
//		int k1 = 7;
//		int k2 = 25;
//		int k3 = 17;
//		System.out.print("k3가 가장 큰 값인가? ");
//		System.out.println((k1<=k3)&&(k2<=k3));
		
//		int m1 = 5;
//		m1 += 2;
//		System.out.println(m1);
//		m1++;
//		System.out.println(m1);
//		
//		m1 -= 1;
//		m1--;
//		System.out.println(m1);
//		
//		int n2 = 10;
//		System.out.println(++n2);
//		System.out.println(n2++);
//		System.out.println(n2);
//		
//		int z = 1;
//		System.out.println(z++ + ++z); //4
//		//                 항이 넘어가면서 계산 완료됨
//		System.out.println(z);//3
		
//		int score = 95;
//		char grade = (score > 90)?'A':'B';
//		System.out.println(grade);

//		int var1 = 5;
//		int var2 = 2;
//		double var3 = (double)var1/var2;
//		double var4 = var3*var2;
//		System.out.println((int)var4);
//		
//		int value = 356;
//		System.out.println(value-(value%100));
		
		//문제
		//소수점 3자리까지 함수 사용하지 않고 나타내기
		double v1 = 1000;
		double v2 = 457;
		
		//풀이
		//자를 소수점까지 정수를 만들고 그걸 다시 실수로 변환
		double v3 = (v1/v2)*1000;
		int v4 = (int)v3;
		double v5 = (double)v4/1000;
		
		System.out.println(v5);
		System.out.println(v1/v2);
	}

}
