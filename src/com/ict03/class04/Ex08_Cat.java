package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal{

	@Override
	public void sound() {
		System.out.println("¾ß¿Ë~");
	}

	@Override
	public void eat(String food) {
		System.out.println("Ãò¸£");
	}

	@Override
	public String play() {
		return "Ä¹ Å¸¿ö¿¡¼­ ÀáÀÚ±â";
	}

}
