package com.java8features.lambdafeatures;
interface Lam{
	int add(int num1,int num2);
}
class Other{
	int add1(int num1,int num2){
		int num3=num1+num2;
		System.out.println("Method Reference "+num3);
		return num3;
	}
}
public class Lambdaexam {
		
	public static void main(String[] args) {
		
		System.out.println("Return Value :");
		Other lam5=new Other();
		Lam mref=lam5::add1;
		mref.add(5, 7);
		
	}

}
