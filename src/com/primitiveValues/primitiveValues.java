package com.primitiveValues;

public class primitiveValues {

	public static void main(String[] args) {
		int x=3;
		int y=2;
		System.out.println("x:" + x + ", y:" + y);
		falseSwap(x,y);
		System.out.println("x:" + x + ", y:" + y);
		moreOperation(x,y);
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public static void falseSwap(int x, int y){
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public static void moreOperation(int a, int b){
		a=3; b=2;
		System.out.println("a:" + a + ", b:" + b);
		a=a*b;
		b=12;
		System.out.println("a:" + a + ", b:" + b);
		falseSwap(a,b);
	}
}
