package org.test;

public class Sample {
	
	static int max(int a,int b) {
	return a>b?a:b;
	}
	
	static char max(char a,char b) {
	return a<b?b:a;
	}
	
	static double min(double a,double b) {
	return a>b?b:a;
	}
	
	static float min(float a,float b) {
	return a<b?a:b;
	}
	
	public static void main(String[] args) {
		System.out.println(max(10,40));
		System.out.println(min('g','v'));
		System.out.println(max(10,20));
		System.out.println(max(10,80));
	}
}
