package sec04.exam03;

import java.util.Scanner;

public class CoffeExam {

	public static void main(String[] args) {
		CoffeeFactory cf = new CoffeeFactory();
		Scanner scn = new Scanner(System.in);		
		int slct1 = 0;
		int slct2 = 0;
		int slct3 = 0;
		int slct4 = 0;
		int slct5 = 0;
		int slct6 = 0;
		int slct7 = 0;
		
		do {
			System.out.println("1. 생산품 목록 2.상품추가 3.상품 가격 변경 4. 예약상품 확인 5. 생산시작 6.누적 매출&물량 확인 7. 종료");
			slct1 = scn.nextInt();
			if(slct1 == 1) {//생산품 확인
				do {
					System.out.println("1. Non Cream 2. With Cream  3. 뒤로가기");
					slct2 = scn.nextInt();
					if(slct2 == 1) {//1.Non Cream
						cf.ncfmenu();
						System.out.println();
						do {
							System.out.println("1. 상품 생산 예약 2. 뒤로가기");
							slct3 = scn.nextInt();
							if(slct3 == 1) {
								cf.ncfmenu();
								System.out.println();
								System.out.print("예약하실 상품의 번호를 입력해주세요 : ");
								System.out.println();
								slct4 = scn.nextInt();
								System.out.print("예약하실 상품의 수량을 입력해주세요 : ");
								slct5 = scn.nextInt();
								cf.ncofProd(slct4,slct5);
								System.out.println();
							}
						}while(!(slct3==2));
					} else if (slct2 == 2) {//2.With Cream
						cf.cfmenu();
						System.out.println();
						do {
							System.out.println("1. 상품 생산 예약 2. 뒤로가기");
							slct3 = scn.nextInt();
							if(slct3 == 1) {
								cf.cfmenu();
								System.out.println();
								System.out.print("예약하실 상품의 번호를 입력해주세요 : ");
								System.out.println();
								slct4 = scn.nextInt();
								System.out.print("예약하실 상품의 수량을 입력해주세요 : ");
								slct5 = scn.nextInt();
								cf.cofProd(slct4,slct5);
								System.out.println();
							}
						}while(!(slct3==2));
					}
				}while(!(slct2==3));
			} else if (slct1==2) {//메뉴추가
				System.out.println("추가하실 상품의 종류를 선택해주세요.");
				System.out.println("1. Non Cream 2. With Cream");
				slct6 = scn.nextInt();
				if(slct6==1) {
					System.out.print("추가할 메뉴 이름 :");
                    String menu = scn.next();
                    System.out.print("추가할 메뉴 가격 :");
                    int price = scn.nextInt();
                    cf.ncmenuAdd(menu,price);
				} else if(slct6==2) {
					System.out.print("추가할 메뉴 이름 :");
                    String menu = scn.next();
                    System.out.print("추가할 메뉴 가격 :");
                    int price = scn.nextInt();
                    cf.cmenuAdd(menu,price);
				}
			} else if(slct1==3) {
				System.out.println("가격을 변경하실 상품의 종류를 선택해주세요.");
				System.out.println("1. Non Cream 2. With Cream");
				slct7 = scn.nextInt();
				if(slct7==1) {
					System.out.println("가격을 변경하실 상품의 종류를 선택해주세요.");
					cf.ncfmenu();
					int menuNum = scn.nextInt();
					System.out.println("변경하실 가격을 입력해주세요.");
					int price = scn.nextInt();
					cf.npriceMod(menuNum, price);
					System.out.println();
				} else if (slct7==2) {
					System.out.println("가격을 변경하실 상품의 종류를 선택해주세요.");
					cf.ncfmenu();
					int menuNum = scn.nextInt();
					System.out.println("변경하실 가격을 입력해주세요.");
					int price = scn.nextInt();
					cf.npriceMod(menuNum, price);
					System.out.println();
				}
			} else if (slct1==4) {//예약상품 확인
				cf.cofprdc();
			} else if (slct1==5) {//생산시작
				cf.prodchekin();
			} else if (slct1==6) {//누적 생산 물량 확인
				cf.prodmntslt();
			}
		}while(!(slct1 == 7));
		System.out.println("아쓰브라의 생산 시스템을 종료합니다.");
		
	}

}
