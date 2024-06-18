package jp.co.diworks.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(gokei2(5,7));
		System.out.println(circle(5));
		System.out.println(hikizan(10,10));
		System.out.println(kakezan(3,8));
		System.out.println(warizan(15,3));
	}
	
	public static int gokei2(int number1,int number2) {
		return number1 + number2;
	}
	
	public static double circle(int pi) {
		return pi*pi*3.14;
	}
	
	public static int hikizan(int number3,int number4) {
		return number3-number4;
	}
	
	public static int kakezan(int number5,int number6) {
		return number5*number6;
	}
	
	public static int warizan(int number7,int number8) {
		return number7/number8;
		
	}
	
}
