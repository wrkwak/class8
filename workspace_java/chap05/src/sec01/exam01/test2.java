package sec01.exam01;

public class test2 {

	public static void main(String[] args) {
        // 8번 문제 : 중복없는 로또 번호 출력하기 
        int[] lotto = new int[6];

        int lnum = 0;
        System.out.print("1차번호 :");
        for (int i = 0; i <= lotto.length-1; i++) {
            lnum = ((int) (Math.random() * 45)+1);
            if(lnum != 0){
                lotto[i] = lnum;
            } else{
                i--;
            }
            System.out.print(lotto[i]+" ");
        }
        System.out.println();
        for(int l = 0; l <=lotto.length-1; l++){
            for(int m = l; m <= lotto.length-2; m++){
                if(lotto[l]==lotto[m+1]){
                    System.out.println("중복이 발생했으므로 정제를 시작합니다.");
                    if(m==lotto.length-2){
                        lotto[m+1]= ((int) (Math.random() * 45)+1);
                        if(l!=0) {
                        	--l;                        	
                        }
                        --m;
                    } else{
                        lotto[m+1]= ((int) (Math.random() * 45)+1);
                        --m;
                    }
                }
            }
        }
        System.out.print("정제번호 :");
        for(int o = 0; o <= lotto.length-1; o++){
            System.out.print(lotto[o]+" ");
        }
	}
}