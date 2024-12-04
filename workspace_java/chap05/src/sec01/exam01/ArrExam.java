package sec01.exam01;

public class ArrExam {

	public static void main(String[] args) {
		//선언방법
//		int [] score ; // java 스타일
//		int score []; // c스타일
		
//		int scor_0 = 90;
//		int scor_1 = 80;
//		int scor_2 = 70;
//		int[] intArray = {90,80,70};
		
//		int[] intArray = new int[3];
//		intArray[0] = 90;
//		intArray[1] = 80;
//		intArray[2] = 70;
//		
//		int [] intArray2 = null;
//		intArray2 = new int [] {20, (int)Math.random(),90};
//		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
////		System.out.println(intArray[3]);
//		
//		System.out.println(intArray2);//[I@9e89d68
//		
//		String[] sArr = new String[14];
//		
//		for(int k = 0; k <= 13; k++) {
////			sArr[k] = "이름"+(k+1);
////			System.out.println(sArr[k]);
//			System.out.println("sArr["+k+"] = "+"\"이름"+(k+1)+"\"");
////			System.out.prinf(sArr[k] = "이름k";);
//		}
		
		int[] arr= new int[10];
		int sum = 0;
		
		for(int j = 0; j<=arr.length-1; j++) {
			arr[j]=j+1;
			sum += arr[j];
		}
		System.out.println(sum/arr.length);
		System.out.println(sum);
		
		for(int k = arr.length-1; k >= 0; k--) {
			System.out.println(arr[k]);
		}
		
	}

}
