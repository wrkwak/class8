package sec01.exam02;

public class VarialbleUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총 " + totalMinute*60 + "초");
		System.out.println("총 " + totalMinute + "분");
		
		int x = 10;
		int y = 20;
		System.out.println("x의 값 : "+(x+y));
		
		x=y;
		System.out.println("x의 값 : "+x);
		
		int j = 1;
		System.out.println("j : "+j);
		{
			System.out.println("j : "+j);	
		}
		{
			int i = 0;	
		}
//		System.out.println("i : "+ i);
		
		
	}

}
