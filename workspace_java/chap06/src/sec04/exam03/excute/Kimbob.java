package sec04.exam03.excute;

import java.util.ArrayList;
/*
 * 김밥천국 관리 클래스
 * 2024/12/10 최초생성
 * by 곽우림
 *   
 */
public class Kimbob {
   
   String name;    //지점명
   String address; //주소
   
//   String[] menu;  //메뉴들
//   int[] price;    //메뉴와 순서를 맞춰 관리하는 가격들
   
   //순서대로 저장함 arraylist
   ArrayList menu;  //메뉴들
   ArrayList price; //메뉴와 순서를 맞춰 관리하는 가격들
   
   ArrayList cartMenu;  //장바구니 메뉴들
   ArrayList cartPrice; //장바구니 가격
   ArrayList cartCnt; //장바구니 메뉴 수량
   
   int seedMoney; //권리금
   int toSale=0;
   int cnt=0;
   int arrcnt=0;
   int totPrice =0;
   int totCnt =0;
   int tot = 0;
   int toSales=0;

   
   Kimbob(){ // 키오스크 가동시 동작
      this.menu = new ArrayList();
      this.price = new ArrayList();
      
      this.cartMenu = new ArrayList();
      this.cartPrice = new ArrayList();
      this.cartCnt = new ArrayList();
      
      this.menu.add("야채김밥");
      this.price.add(3500);
      
      this.menu.add("라면");
      this.price.add(4000);
   }
   
   Kimbob(int seedMoney){//시드머니 변경
      this.seedMoney = seedMoney;
      System.out.println("권리금이"+seedMoney+"원 으로 변경되었습니다.");
   }
   
   void sales() {
      toSales += tot;
      System.out.print(toSales);
   }
   /*
    * 메뉴 추가
    * 
    * @parameter String 메뉴명, int 가격
    * @return void
    * 
    * */
   void menuAdd(String menu, int price) {
      this.menu.add(menu);
      this.price.add(price);
      System.out.println("["+menu+","+price+"] 추가완료");
   }
   
   /*
    * 주문하기
    * 
    * @parameter int index(메뉴번호)
    * @return void
    * 
    * */
   void order(int index, int cnt) {
      String menuName = (String)this.menu.get(index); // 번호로 메뉴찾기
      int menuPrice = (int)this.price.get(index); // 번호로 메뉴찾기
      int menuCnt = cnt;
      
      this.cartMenu.add(menuName);
      this.cartPrice.add(menuPrice);
      this.cartCnt.add(menuCnt); 
      
      System.out.println("주문이 장바구니에 담겼습니다.");
      System.out.println();
      this.arrcnt++;
   }

   /*
    * 가격 변경
    * 
    * @parameter 
    * @return void
    * 
    * */
   void priceMod(int menu, int price) {
      this.menu.set(menu+1,price);
      System.out.print("[");
      System.out.print(this.menu.get(menu));
      System.out.print(",");
      System.out.print(this.menu.get(menu+1));
      System.out.println("] 변경완료!");
   }
   
   
   void cart() {
      for(int i = 0; i< this.arrcnt; i++) {
         System.out.println((i+1)+". "+this.cartMenu.get(i)+" "+this.cartPrice.get(i)+"원 수량 : "+this.cartCnt.get(i));
         int cartPrice = (int)this.cartPrice.get(i);
         totPrice += cartPrice;
         
         int cartCnt = (int)this.cartCnt.get(i);
         totCnt += cartCnt;
      }
      tot = totPrice * totCnt;
      System.out.println("총 금액 : "+tot);
      System.out.println();
   }
   
   void chekIn() {
      System.out.println("결제하실 총 금액 : "+this.tot+"원");
      System.out.println("결제완료 되었습니다.");
      System.out.println();
   }
   /*
    * 전체 메뉴와 가격 확인
    * 야채 : 3500원
    * 라면 : 4000원
    * @parameter
    * @return void
    * 
    * */
   void menuList() {
      for(int i = 0; i< this.menu.size(); i++) {
         System.out.print(i+" ");
         System.out.print(this.menu.get(i)+" - "); 
         System.out.println(this.price.get(i)+"원"); 
      }
   }
   /*
    * 영수증 출력
    * 
    * @parameter int index(메뉴번호), int count(개수)
    * @return void
    * 
    * */
   void print(int index, int count) {
      String menuName = (String)this.menu.get(index);
      int menuPrice = (int)this.price.get(index);
      
      System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:");
      System.out.println("메뉴명 : "+menuName);
      System.out.println("주문수 : "+count);
      System.out.println("총금액 : "+menuPrice*count );
      System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:");
   }

   

}
