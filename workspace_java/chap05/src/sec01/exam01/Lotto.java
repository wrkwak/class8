package sec01.exam01;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {

			int lnum = 0;
			int nnum = (int) (Math.random() * 50);  

			if (lnum == nnum || nnum == 0) {// 이전번호와 뽑은 번호가 같거나 0이 나오면
				lnum = nnum;
				i--;
			} else {
				System.out.print(nnum + " ");				
			}
		}

		System.out.println();

	}

}
