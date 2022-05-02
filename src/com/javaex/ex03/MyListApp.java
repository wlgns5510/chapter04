package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		
		////////////////////////////////////
		// Point 관리
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).toString());
		
		System.out.println("-------------");
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getX()); 
		}
		
		System.out.println("================================");
		
		////////////////////////////////////
		// 원 관리
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(13);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(p01);  //Circle만 관리한다
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			//System.out.println(  ( (Circle)cList.get(i) ).getRadius()   );
			System.out.println(cList.get(i).getRadius());
		}
		
		
		
		
		
	}

}