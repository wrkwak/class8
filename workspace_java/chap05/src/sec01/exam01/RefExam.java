package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		String c = "최민수";
		String e = "최민수";
		// = 을 기준으로 오른쪽이 먼저 실행된다.
		// "최민수"를 힙영역의 비어있는 번지에 할당
		// 스택 영역의 변수 c에 그 번지가 기록된다.
		
		String d = new String("최민수");
		//무조건 힙역역의 새로운 번지에 할당
		System.out.println(c==e);
		
		System.out.println(c.equals(d));
		//String 값의 비교는 equals를 사용한다.
		//                   equals는 힙영역안에 있는 값을 char 타입으로 쪼개서 비교함
		
		
		System.out.println(a+","+b);
		b = 12;
		System.out.println(a+","+b);
		// == 무조건 스택 값을 비교
		
		//null은 참조하는 주소가 없는 상태
		String f = "휴먼";
		f= null; // f = ""와 다름
		System.out.println(f==null);
		System.out.println(f!=null);
		System.out.println(f+"dd"); // nulldd로 출력됨
		
		//초기화나 값이 할당되지 않은 경우 사용은 못함
//		String g;
		String g = null;
		System.out.println(g==null);
//		int a = null;
//		System.out.println(a);
		
		//null인 상태에서는 null인지 아닌지만 가능하다
		System.out.println(g.equals(c));
		
	}

}
