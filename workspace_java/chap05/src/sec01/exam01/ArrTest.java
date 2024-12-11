package sec01.exam01;

import java.util.Scanner;

public class ArrTest { 

    public static void main(String[] args) {
        int [] arr = {3,4,7,5,1,4,6};
      int cntt = 0;

      // 1번 문제 : 홀수의 개수 구하기
      for(int i=0; i<= arr.length-1; i++) {
         if(arr[i] % 2 != 0) {
            cntt += 1;
         }
      }
      System.out.println("1번 문제 답 : "+cntt);

      //2번 문제 : 4보다 큰 수의 개수 구하기
      int cnt = 0;
      for(int j=0; j<= arr.length-1; j++) {
         if(arr[j] > 4) {
            cnt += 1;
         }

      }
      System.out.println("2번 문제 답 : "+cnt);

        //3번문제 : 최대값 구하기
        int swp = 0;

        for(int k=0; k<= arr.length-1; k++) {
            for(int m = k; m <= arr.length-1; m++) {
                if(arr[k] > arr[m]) {
                    swp = arr[m]; //작은거
                    arr[m] = arr[k];
                    arr[k] = swp;
                }
            }
        } System.out.println("3번 문제 답 : "+arr[arr.length-1]);        

        //4번 문제 : 두번째 큰 수 구하기
        for(int k=0; k<= arr.length-1; k++) {
            for(int m = k; m <= arr.length-1; m++) {
                if(arr[k] > arr[m]) {
                    swp = arr[m]; //작은거
                    arr[m] = arr[k];
                    arr[k] = swp;
                }
            }

        } System.out.println("4번 문제 답 : "+arr[arr.length-2]);

        // 5-1번 문제 : 0으로 채우기
        int[] a = {1,2,3,4};
        System.out.print("5-1번 문제 답 : ");
        for(int k=0; k<= a.length-1; k++) {
            a[k] = 0;
            System.out.print(a[k]+" ");
        }
        System.out.println();

        // 5-2번 문제 : 첫자리에 마지막 숫자 넣기
        int[] aa = {1,2,3,4};
        int swp1 = 0;
        System.out.print("5-2번 문제 답 : ");
        for(int k=0; k<= aa.length-1; k++) {
            if(k == 0) {
                swp1 = aa[k]; //앞자리
                aa[k] = aa[aa.length-1];
                aa[aa.length-1]= swp1;
            }
            System.out.print(aa[k]);
        }
        System.out.println(); 

        // 6-1번 문제 : 숫자로 임시비밀번호 8자리 만들기
//      int pwd = (int) (Math.random() * 10);
      int [] pwds = new int[8];
        System.out.print("6-1번 문제 답 : ");
      for(int y = 0; y <= pwds.length-1; y++) {
         pwds[y] = (int) (Math.random() * 10);
         System.out.print(pwds[y]+"");
      }
      System.out.println();

        // 6-2번 문제 : 소문자로 임시비밀번호 8자리 만들기
//        char [] pwds2 = new char[8];
        int rnd = 0;
        cnt = 0;
        System.out.print("6-2번 문제 답 : ");
        do{
            rnd = (int) (Math.random() * 140); // 랜덤
            if( 97 <= rnd && rnd <= 122){
                System.out.print((char)rnd);
//                System.out.print(pwds2[cnt]);
                cnt += 1;
            }
        }while(!(cnt == 8));
        System.out.println();

        // 6-3번 문제 : 숫자 2개 이상 + 대소문자로 임시비밀번호 8자리 만들기
//        int rnd = 0;
        cnt = 0;
        System.out.print("6-3번 문제 답 : ");
        do{ 
            rnd = (int) (Math.random() * 10); // 랜덤
            System.out.print(rnd+1);
            cnt += 1;
        } while(!(cnt == 2));
        cnt = 0;
        do{
            rnd = ((int) (Math.random() * 90))+1; // 랜덤
            if(65 <=rnd && rnd <= 90){
                System.out.print((char)rnd);
                cnt += 1;
            }
        }while(!(cnt == 3));
        cnt = 0;
        do{
            rnd = ((int) (Math.random() * 122))+1; // 랜덤
            if( 97 <= rnd && rnd <= 122){
                System.out.print((char)rnd);
                cnt += 1;
            }
        }while(!(cnt == 3));
        System.out.println();

        // 7번 문제 : 예약
        Scanner scan = new Scanner(System.in);
        cnt = 0;
        int [] rsv = new int[10];
        int sys = 0;
        do {
            System.out.println("1.예약 2.모든좌석현황 3.잔여좌석 4.종료");
            sys = scan.nextInt();

            if(sys == 1) {
                System.out.print("예약할 좌석을 입력해주세요.");
                int ans = scan.nextInt();

                for(int i=0; i<=rsv.length-1; i++) {
                    if (rsv[i] == ans) {
                        System.out.println("이미 예약된 좌석입니다.");
                        break;
                    } else {
                        rsv[ans-1] = ans;
                        System.out.println(ans+"번자리 예약 했습니다.");
                        break;
                    }
                }

            }
            if(sys == 2) {
                for(int i=0; i<=rsv.length-1; i++) {
                    if(rsv[i] != 0) {
                        System.out.println((i+1)+"번 자리 : 예약불가");
                    } else {
                        System.out.println((i+1)+"번 자리 : 예약가능");
                    }
                }
            }
            if(sys == 3) {
                for(int i=0; i<=rsv.length-1; i++) {
                    if(rsv[i] != 0) {
                        cnt += 1;
                    }
                }
                System.out.println((rsv.length-cnt)+"자리 남았습니다.");
                cnt = 0;
            }
        } while(!(sys == 4));


        // 8번 문제 : 중복없는 로또 번호 출력하기 
        int[] lotto = new int[6];

        int lnum = 0;
        System.out.print("1차번호 :");
        for (int i = 0; i <= lotto.length-1; i++) {
            lnum = ((int) (Math.random() * 45)+1);
            lotto[i] = lnum;
            System.out.print(lotto[i]+" ");
        }
        System.out.println();
        for(int l = 0; l <=lotto.length-1; l++){
            for(int m = l; m <= lotto.length-2; m++){
                if(lotto[l]==lotto[m+1]){
                    System.out.println("중복이 발생했으므로 정제를 시작합니다.");
                    if(m==lotto.length-2){
                        lotto[m+1]= ((int) (Math.random() * 45)+1);
//                        System.out.println("1번오류 ");	
//                        System.out.println("l : "+l);	
//                        System.out.println("m : "+m);	
                        if(l!=0) {
                        	--l;                        	
                        }
                        --m;
//                        System.out.println("l : "+l);	
//                        System.out.println("m : "+m);	
                        
                    } else{
                        lotto[m+1]= ((int) (Math.random() * 45)+1);
//                        System.out.println("2번오류");
//                        System.out.println("l : "+l);	
//                        System.out.println("m : "+m);	
                        --m;
//                        System.out.println("l : "+l);	
//                        System.out.println("m : "+m);	
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