package sec01.exam01;

public class Page224 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
//		int mint = Integer.MAX_VALUE;
		int mx = 0;
		int cnt = 0;
		
		for(int i = 0; i <array.length; i++ ) {
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
				if(mx < array[i][j]) {
					mx =array[i][j];
				}
				cnt++;
			}
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+(sum/cnt));
		System.out.println("가장 큰 값 : "+mx);
	}

}
