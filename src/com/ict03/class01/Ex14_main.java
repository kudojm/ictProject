package com.ict03.class01;

public class Ex14_main {
	public static void main(String[] args) {
		// int su2 = 10; // static 이니까 이게 있다고 생각하셈
		
		Ex14 t1 = new Ex14(); // 만든순간 안에있는거 계산 ㄱ
		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(Ex14.su2);
		System.out.println();
		
		Ex14 t2 = new Ex14(); 
		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(Ex14.su2);
		System.out.println();
		
		Ex14 t3 = new Ex14(); 
		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(Ex14.su2);
		System.out.println();
	}
}
