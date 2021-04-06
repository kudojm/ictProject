package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인원수 받아
		System.out.println("몇명 : ");
		int people = sc.nextInt();
		
		// 상품명과 가격(Ex10)을 가지는 배열
		Ex10[] offer = new Ex10[people];
		
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.아메리카노(2500원)");
			System.out.println("2.카페모카(3000원)");
			System.out.println("3.카페라떼(3500원)");
			System.out.println("4.자몽쥬스(4000원)");
			System.out.println("선택하세요 >>> ");
			
			// 메뉴 선택한거 번호받아
			int menu = sc.nextInt();
			
			// 메뉴 뭐 받았는지 이름은 뭔지 가격은 얼만지 정해
			Ex10 product = new Ex10();
			if (menu == 1) {
				product.setName("아메리카노");
				product.setPrice(2500);
				
			} else if (menu == 2) {
				product.setName("카페모카");
				product.setPrice(3000);
			
			} else if (menu == 3) {
				product.setName("카페라떼");
				product.setPrice(3500);		
				
			} else if (menu == 4) {
				product.setName("자몽쥬스");
				product.setPrice(4000);
				
			}
			// 정했으면 배열에다가 다쳐넣어
			offer[i] = product;
		}
		
		// 전체금액 계산
		int sum = 0; // 전체금액 저장해야지 만들어
		for (int i = 0; i < offer.length; i++) { // 
			sum = sum + offer[i].getPrice(); // for문 돌려서 선택한거 개당 얼만지 가져와서 총액에 쳐넣어
		}
		System.out.println("총 액 : " + sum);
		System.out.print("입 금 액 : ");
		int input = sc.nextInt();
		System.out.print("잔 돈 : " + (input - sum));
				
	}
}
