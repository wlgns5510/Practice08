package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false
		System.out.println(p2 == p3); //false
		System.out.println(p3 == p4); //false
		System.out.println(p4 == p1); //true
		System.out.println(p1.equals(p2)); //false
		System.out.println(p4.equals(p1)); //true
		
		//equals는 Object 아래의 메소드이기 때문에 사용할 수 있음.
	}

}


