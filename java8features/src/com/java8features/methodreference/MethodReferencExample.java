package com.java8features.methodreference;
interface MethRef{
	int add(int num1,int num2);
}
class Sam{
	int addition(int n1,int n2) {
		int temp=n1+n2;
		System.out.println("The Addition of Two Number is "+temp);
		return temp;
	}
}

public class MethodReferencExample {
	public static void main(String[] args) {
		Sam s=new Sam();
		MethRef mf=s::addition;
		mf.add(14, 1);
		
	}

}
