package sec04.exam03;

import java.util.ArrayList;

public class Kimbob {
	   String name;    //지점명
	   String address; //주소
	   String cartM;
	   String mn;
	   String msg;
	   
	   //순서대로 저장함 arraylist
	   ArrayList menu;  //메뉴들
	   ArrayList price; //메뉴와 순서를 맞춰 관리하는 가격들
	   
	   ArrayList cartMenu;  //장바구니 메뉴들
	   ArrayList cartPrice; //장바구니 가격
	   ArrayList cartCnt; //장바구니 메뉴 수량
	   
	   ArrayList muNum;  //장바구니 메뉴 넘버
	   ArrayList muNm; //장바구니 가격
	   ArrayList mnPrice; //장바구니 메뉴 가격
	   ArrayList mnCnt; //장바구니 메뉴 수량
	   
	   int seedMoney; //권리금
	   int toSale=0;
	   int cnt=0;
	   int arrcnt=0;
	   int totPrice =0;
	   int totCnt =0;
	   int tot = 0;
	   int toSales=0;
	   int num=0;
	   int cartP;
	   int cartC;
	   int nm;
	   int mp;
	   int mc;
	   int menuCnt=0;

	   
	   Kimbob(){ // 키오스크 가동시 동작
	      this.menu = new ArrayList();
	      this.price = new ArrayList();
	      
	      this.cartMenu = new ArrayList();
	      this.cartPrice = new ArrayList();
	      this.cartCnt = new ArrayList();
	      
	      this.muNum   = new ArrayList();    
	      this.muNm    = new ArrayList();
	      this.mnPrice = new ArrayList();
	      this.mnCnt   = new ArrayList();
	      
	      this.menu.add("야채김밥");
	      this.price.add(3500);
	      
	      this.menu.add("라면");
	      this.price.add(4000);
	   }
	   
	   
	   void store() {//매출값 누적
	      toSales += tot;
	   }
	   
	   void sales() {//매출값 출력
		   System.out.print(toSales);
	   }

	   void menuAdd(String menu, int price) {//메뉴추가
	      this.menu.add(menu);
	      this.price.add(price);
	      System.out.println("["+menu+","+price+"] 추가완료");
	   }
	   
	   void priceMod(int menu, int price) {//가격변경
		   this.price.set(menu,price);
		   System.out.print("[");
		   System.out.print(this.menu.get(menu));
		   System.out.print(",");
		   System.out.print(this.price.get(menu));
		   System.out.println("] 변경완료!");
	   }
	   
	   void order(int index, int cnt) {//주문하기
	      String menuName = (String)this.menu.get(index); // 번호로 메뉴찾기
	      int menuPrice = (int)this.price.get(index); // 번호로 메뉴찾기
	      this.menuCnt = cnt;
	      
	      this.cartMenu.add(menuName);
	      this.cartPrice.add(menuPrice);
	      this.cartCnt.add(menuCnt); 
	      
	      System.out.println("주문이 장바구니에 담겼습니다.");
	      System.out.println();
	      this.arrcnt=1;
	      cart();
	      tot += totPrice;
	   }

	   
	   void cart() {//장바구니
		   if(arrcnt!=0) {
			   for(int i = 0; i< this.arrcnt; i++) {
				   int cartPrice = (int)this.cartPrice.get(i);
				   totPrice = (cartPrice*menuCnt);
				   
				   cartM = (String)this.cartMenu.get(i); 
				   cartP = (int)this.cartPrice.get(i); 
				   cartC = (int)this.cartCnt.get(i); 
				   
				   cartStore(cartM,cartP,cartC);
				   
				   this.cartMenu.clear();
				   this.cartPrice.clear();
				   this.cartCnt.clear();
				   
				   msg ="장바구니 실행";
			   }
		   } else if(arrcnt == 0) {
			   msg = "장바구니가 비었습니다.";
			   System.out.println(msg);
			   System.out.println();			   
		   }
	   }
	   
	   void cartStore(String muNm, int muPrice, int mnCnt) {//장바구니 메뉴 저장
		   this.muNum.add(num+1);
		   this.muNm.add(muNm);
		   this.mnPrice.add(muPrice);
		   this.mnCnt.add(mnCnt);
		   num++;
		   }
	   
	   void cartOut() {
		   if(msg=="장바구니 실행") {
			   for(int i = 0; i< num; i++) {
				   nm = (int) this.muNum.get(i);
				   mn = (String) this.muNm.get(i);
				   mp = (int) this.mnPrice.get(i);
				   mc = (int) this.mnCnt.get(i);			   
				   System.out.println(nm+". "+mn+" "+mp+"원 수량 : "+mc);
			   }
			   System.out.println("총 금액 :"+tot+"원");
		   } else {
			   System.out.println("장바구니가 비었습니다.");
			   System.out.println();
		   }
		   arrcnt = 0;
	   }

	   
	   void chekIn() {//결제
	      System.out.println("결제하실 총 금액 : "+this.tot+"원");
	      System.out.println("결제완료 되었습니다.");
	      System.out.println();
	      
	      this.cartMenu.clear();
	      this.cartPrice.clear();
	      this.cartCnt.clear();
	      
	      this.muNum.clear();
	      this.muNm.clear();
	      this.mnPrice.clear();
	      this.mnCnt.clear();
	      
	      this.arrcnt = 0;
	      this.store();
	      this.tot=0;
	      this.totPrice = 0;
	      this.totCnt = 0;
	      this.num = 0;
	      
	      msg = "장바구니가 비었습니다.";
	   }
	   
	   void menuList() {//메뉴판
	      for(int i = 0; i< this.menu.size(); i++) {
	         System.out.print(i+" ");
	         System.out.print(this.menu.get(i)+" - "); 
	         System.out.println(this.price.get(i)+"원"); 
	      }
	   }

//	   void print(int index, int count) {//영수증
//	      String menuName = (String)this.menu.get(index);
//	      int menuPrice = (int)this.price.get(index);
//	      
//	      System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:");
//	      System.out.println("메뉴명 : "+menuName);
//	      System.out.println("주문수 : "+count);
//	      System.out.println("총금액 : "+menuPrice*count );
//	      System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:");
//	   }

//	   Kimbob(int seedMoney){//시드머니 변경
//	      this.seedMoney = seedMoney;
//	      System.out.println("권리금이"+seedMoney+"원 으로 변경되었습니다.");
//	   }
}
