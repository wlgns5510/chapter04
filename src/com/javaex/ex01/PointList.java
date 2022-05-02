package com.javaex.ex01;

public class PointList {

	//필드
	private Point[] pArray;
	private int crtPos;
	//생성자
	public PointList() {
		//배열3개 --> 원래는 만들지 않는다
		pArray = new Point[3];
		crtPos =0;
	}
	//메소드 gs
	//메소드 일반
	public void add(Point point) {
		
		//현재배열갯수+1
		pArray[crtPos] = point;
		crtPos = crtPos +1;
		
		//기존배열의 내용은 그대로 복사
		
		
		
		//마지막 방에 point를 대입
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
}
