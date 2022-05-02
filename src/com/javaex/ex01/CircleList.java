package com.javaex.ex01;

public class CircleList {

	//필드
	private Circle[] cArray;
	private int cir;
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		cir = 0;
	}
	//메소드 gs
	//메소드 일반
	public void add(Circle circle) {
		cArray[cir] = circle;
		cir = cir +1;
	}
	
	public int size() {
		return cir;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}

}
