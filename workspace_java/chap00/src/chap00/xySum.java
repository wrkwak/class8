package chap00;

public class xySum {

	public static void main(String[] args) {
		for(int x=1; x<=15; x++) {
			for(int y=1; y<=15; y++) {
				if(4*x+5*y == 60) {
					System.out.println("x,y : "+x+","+y+" ");
				}
			}
		}
	}

}
