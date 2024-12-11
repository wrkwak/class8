package sec04.exam03.excute;

import java.util.Scanner;

public class KimbobExam {

   public static void main(String[] args) {
      Kimbob cheon = new Kimbob();
      Scanner scn = new Scanner(System.in);
      int admpwd = 2580;
      int pwdtryn = 0;
      int kiosk = 0;
      int kioskSm = 0;

      do {
         System.out.println("1.운영메뉴 2.관리자메뉴 3.종료");
         System.out.print("입력 : ");
         kiosk = scn.nextInt();

         if (kiosk == 2) {
            System.out.println("패스워드를 입력하세요.");
            int pwd = scn.nextInt();

            // 관리자 패스워드 확인(이것도 클래스로 바꿔)
            for (int i = 0; i <= 5; i++) {
               if (pwdtryn <= 5) {
                  if (pwd != admpwd) {
                     pwdtryn++;
                     System.out.println("비밀번호를 틀렸습니다.");
                     System.out.println("남은횟수 :" + (5 - pwdtryn) + "회");
                     System.out.println("패스워드를 입력하세요.");
                     pwd = scn.nextInt();
                     System.out.println();
                  } else if (pwd == admpwd) {
                     System.out.println("로그인 성공!");
                     System.out.println();
                     pwdtryn += 10;
                  }
               }
            }
            do {// 관리자 메뉴
               System.out.println("1.메뉴추가 2.가격변경 3.매출확인 4.종료");
               System.out.print("입력 : ");
               kiosk = scn.nextInt();

               if (kiosk == 1) {// 메뉴추가
                  if (kiosk == 1) {
                     System.out.println("추가하실 메뉴와 가격를 입력해주세요.");
                     System.out.print("추가할 메뉴 이름 :");
                     String menu = scn.next();
                     System.out.print("추가할 메뉴 가격 :");
                     int price = scn.nextInt();
                     cheon.menuAdd(menu, price);
                  }
               } else if (kiosk == 2) {
                  System.out.println("가격을 변경하실 메뉴의 번호를 선택해주세요.");
                  cheon.menuList();
                  int menuNum = scn.nextInt();
                  System.out.println("변경하실 가격을 입력해주세요.");
                  int price = scn.nextInt();
                  cheon.priceMod(menuNum, price);
                  System.out.println();
               } else if (kiosk == 3) {
                  System.out.print("오늘 매출 : ");
                  cheon.sales();
                  System.out.println("원");
                  System.out.println();
               }

            } while (!(kiosk == 4));

         } else if (kiosk == 1) {
            do {// 운영 메뉴
               System.out.println("1.주문 2.장바구니 확인 3.결제");
               System.out.print("입력 : ");

               if (kiosk == 1) {// 운영메뉴
                  kioskSm = scn.nextInt();
                  if (kioskSm == 1) {// 주문
                     System.out.println("주문하실 메뉴의 번호를 선택해주세요.");
                     cheon.menuList();
                     int menuNum = scn.nextInt();
                     
                     System.out.println("수량을 선택해주세요.");
                     int menuCnt = scn.nextInt();
                     cheon.order(menuNum,menuCnt);
                     
                  } else if (kioskSm == 2) {//장바구니 확인
                     cheon.cart();
                  } else if (kioskSm == 3) {//결제
                     cheon.chekIn();
                  }
               }
            } while (!(kioskSm == 3));
         }
      } while (!(kiosk == 3));
   }
}
