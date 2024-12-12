package sec04.exam03;

import java.util.ArrayList;

public class CoffeeFactory {
	ArrayList ncream;
	ArrayList ncprice;
	ArrayList ncdesc;
	
	ArrayList cream;
	ArrayList cprice;
	ArrayList cdesc;
	
	ArrayList prodidx;
	ArrayList prodnm;
	ArrayList prodprc;
	ArrayList prodcnt;
	
	ArrayList px;
	ArrayList pnm;
	ArrayList pprc;
	ArrayList pcnt;

	int totc = 0;
	int totp = 0;
	int n = 0;
	int totcc = 0;
	
	CoffeeFactory (){		
		System.out.println("에스프레소 전문 Factory 아쓰브라 생산 시스템 가동!");
		System.out.println();
		
		ncream = new ArrayList(); 
		ncprice = new ArrayList();
		
		cream  = new ArrayList();
		cprice = new ArrayList();
		
		prodidx = new ArrayList();
		prodnm  = new ArrayList();
		prodprc  = new ArrayList();
		prodcnt = new ArrayList();
		
		px   = new ArrayList();   
		pnm  = new ArrayList();    
		pprc = new ArrayList();     
		pcnt = new ArrayList();  
		
		//non크림
		ncream.add("Espresso");
		ncprice.add(3500);
		ncream.add("Espresso Doppio");
		ncprice.add(4000);
		ncream.add("Ristretto");
		ncprice.add(4500);
		
		//크림
		cream.add("Cafe Cream");
		cprice.add(4500);
		cream.add("Cafe Noisette");
		cprice.add(5000);
		cream.add("Cafe Cortado");
		cprice.add(4500);
	
	}
	
	void ncfmenu(){//논크림 메뉴리스트
		for(int i=0; i<ncream.size(); i++) {
			String ncrm = (String)ncream.get(i); 
			int ncrp = (int) ncprice.get(i); 
			
			System.out.println((i+1)+". 커피명 : "+ncrm+" 가격 : "+ncrp+"원"); 
		}
		
	}	
	void cfmenu(){//크림 메뉴리스트
		for(int i=0; i<cream.size(); i++) {
			String crm = (String)cream.get(i); 
			int crp = (int) cprice.get(i); 
			
			System.out.println((i+1)+". 커피명 : "+crm+" 가격 : "+crp+"원"); 
		}
	}
	void ncmenuAdd(String menu, int price) {//논크림메뉴추가
	      ncream.add(menu);
	      ncprice.add(price);
	      System.out.println("["+menu+","+price+"] 추가완료");
	   }
	
	void cmenuAdd(String menu, int price) {//크림메뉴추가
		cream.add(menu);
		cprice.add(price);
		System.out.println("["+menu+","+price+"] 추가완료");
	}
	void npriceMod(int menu, int price) {//논크림 가격변경
		ncprice.set(menu-1,price);
		System.out.print("[");
		System.out.print(this.ncream.get(menu-1));
		System.out.print(",");
		System.out.print(this.ncprice.get(menu-1));
		System.out.println("] 변경완료!");
	   }
		
	void cpriceMod(int menu, int price) {//크림 가격변경
		cprice.set(menu-1,price);
		System.out.print("[");
		System.out.print(this.cream.get(menu-1));
		System.out.print(",");
		System.out.print(this.cprice.get(menu-1));
		System.out.println("] 변경완료!");
	}
	
	void ncofProd(int index, int cnt) {//논크림 예약
		String nnm = (String) ncream.get(index-1);
		int pprc = (int) ncprice.get(index-1);
		System.out.println("생산물품 : "+nnm+" 수량 : "+cnt+" 예약되었습니다.");
		n++;
		cofprodc(n, nnm, pprc ,cnt);
		}
	
	void cofProd(int index, int cnt) {//크림 예약
		String nnm = (String) cream.get(index-1);
		int pprc = (int) cprice.get(index-1);
		System.out.println("생산물품 : "+nnm+" 수량 : "+cnt+" 예약되었습니다.");
		n++;
		cofprodc(n, nnm, pprc ,cnt);
	}
	
	void cofprodc(int i, String pnm, int prc, int pcnt) {
	
		prodidx.add(i);
		prodnm.add(pnm);
		prodprc.add(prc);
		prodcnt.add(pcnt);
		cofprodin();
	}
	int ridxs = 0;
	String rpbns;
	int rcnt = 0;
	int prodm = 0;
	int prodpr = 0;
	int rppc = 0;
	
	void cofprodin() {//상품 담기
		for(int i = 0; i<prodidx.size(); i++) {
			ridxs = n;
			px.add(ridxs);
			rpbns = (String)prodnm.get(i);
			pnm.add(rpbns);
			rppc = (int) prodprc.get(i);
			pprc.add(rppc);
			rcnt = (int)prodcnt.get(i);
			pcnt.add(rcnt);
			prodpr += (rppc*rcnt);
			prodm += rcnt;		
		}
//		System.out.println(prodpr);
//		System.out.println(prodm);
		cofprodmnt(prodpr, prodm);
		prodidx.clear();
		prodnm.clear();
		prodprc.clear();
		prodcnt.clear();
		
	}
	void cofprdc() {//예약상품 확인
		if(rcnt != 0) {
			for(int i = 0; i< px.size(); i++) {
				System.out.println(px.get(i)+" "+pnm.get(i)+" "+pprc.get(i)+"원 수량 : "+pcnt.get(i));
			}
			System.out.println("물량 : "+prodm+" 총 매출 : "+prodpr);
		} else {
			System.out.println("예약한 상품이 없습니다.");
		}
	}

	void cofprodmnt(int prc, int pct) {// 누적 생산량 적재
		totp += prc;
		totc += pct; 
		totcc = pct;
	}
	void prodmntslt() {// 누적 매출&생산량 확인
		for(int i = 0; i< px.size(); i++) {
			System.out.println(px.get(i)+" "+pnm.get(i)+" "+pprc.get(i)+" "+pcnt.get(i));
		}
		System.out.println("현재 누적 매출 : "+totp+" 누적 물량 : "+totc);
		System.out.println(); 
	}
	void prodchekin() {// 생산 시작
		 System.out.println("상품 생산 시작합니다."); 
		 System.out.println("총 "+totcc+"개 생산완료 되었습니다.");
		 prodidx.clear();
		 prodnm.clear();
		 prodcnt.clear();
		 px.clear();  
		 pnm.clear(); 
		 pprc.clear();
		 pcnt.clear();
		 prodm = 0;
		 prodpr = 0;
		 ridxs = 0;
		 rcnt = 0;
		 prodm = 0;
		 prodpr = 0;
		 rppc = 0;
		 n = 0;

	}
}

