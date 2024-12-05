package sec01.exam01;

import java.util.ArrayList;

public class ArrCopyExam {

	public static void main(String[] args) {
		
		//1호점에서 판매하는 메뉴
//		String[] menu1 = new String[3];
//		menu1[0] = "따아";
//		menu1[1] = "말차";
//		menu1[2] = "라떼";
		
		//2호점에서 1호점과 똑같은 메뉴를 판매할 예정
		/*
		 * 얕은 복사 
		 * shallow copy, thin copy, call by reference
		 * stack 영역의 값(주소)만 복사 - 값이 동기화 됨
		 * 
		 */
		
//		String[] menu2 = menu1;
//		menu2[2] = "바나나라떼";
//		System.out.println("menu1[2] : "+menu1[2]);
		
		/*
		 * 깊은 복사 
		 * deep copy, deep clone, call by value
		 * 전혀 다른 heap 영역에 똑같은 내용으로 채워 놓음
		 * 
		 */
//		String[] menu3 = new String[menu1.length];
//		for(int i = 0; i < menu1.length; i++) {
//			menu3[i] = menu1[i];
//		}
//		menu3[2] = "연유라떼";
//		System.out.println("menu1[2] : "+ menu1[2]);
//		System.out.println("menu3[2] : "+ menu3[2]);
		
		// 3호점에서만 "사라다빵"을 추가로 팔고파~~
		/*
		 * menu3보다 크기가 1개 많은 새로운 배열을 만들고 
		 * 앞부분은 깊은 복사 마지막에 사라다빵 직접 입력
		 * 
		 */
//		menu3 = new String[menu1.length+1];
//		for(int i = 0; i < menu1.length; i++) {
//			menu3[i] = menu1[i];
//		}
//		
//		menu3[menu3.length-1] = "사라다빵";
////		System.out.println("menu1[2] : "+ menu1[2]);
//		System.out.println("menu3[menu3.length-1] : "+ menu3[menu3.length-1]);
//		System.out.println(menu3[0]);
//		
//		menu3 = new String[menu1.length];
//		for(int i = 0; i < menu1.length; i++) {
//			if(menu3[i]=="말차") {
//				continue;
//			} else {
//				menu3[i] = menu1[i];
//			}
//			System.out.println(menu3[i]);
//		}
		//ArrayList 사용법
//		ArrayList list = new ArrayList();
//		// 추가(길이가 가변적임)
//		list.add(1);// 변수에 담을 수 있는 모든 값 입력가능
//		list.add("문자");
//		list.add(false);
//		
//		// 사용
//		System.out.println(list.get(0));
//		
//		// 사이즈
//		System.out.println(list.size());
//		
//		System.out.println(list);
//		
//		//고전 for문
//		for(int i=0; i< menu3.length; i++) {
//			String menu = menu3[i];
//			System.out.println("menu : "+menu);
//		}
//		//향상된 for문
//		for(String menu : menu3) {
//			System.out.println("menu : "+menu);
//		}
//		
	}

}
