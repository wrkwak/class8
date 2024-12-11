package sec04.exam03;


public class Updown {
	
	int rnd = ((int)(Math.random()*100)+1);
	
	void ptry(int pa, int count) {
		if(pa < rnd) {
			System.out.println("으어1업!");
		} else if (pa > rnd) {
			System.out.println("아래!");
		} else if (pa == rnd) {
			System.out.println("즈엉답~!");
		}
		if(count == 1) {
			System.out.println("정답은 "+rnd+"......");
			System.out.println("모든기회가 끝났습니다. 플레이어가 졌습니다.");
		}
	}
	
	void ans() {
		System.out.println(rnd);
	}
	
	
}
