package com.java8features.derfaultandstatic;
interface DefAndSta{
	default void defaultExample() {
		System.out.println("Default Method From Interface");
		
	}
	static void staticExample() {
		System.out.println("Staic Metod From Interface");
	}
}
interface defAndStaExam{
	default void defaultExample() {
		System.out.println("Default Method From Interface defAndStaExam");
		
	}
	
}
public class DefStaExample implements DefAndSta,defAndStaExam{

	public static void main(String[] args) {
		DefAndSta das=new DefStaExample();
		das.defaultExample();
		DefAndSta.staticExample();
	}

	@Override
	public void defaultExample() {
		// TODO Auto-generated method stub
		DefAndSta.super.defaultExample();
	}

}
