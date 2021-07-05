package com.java8features.lambdafeatures;
interface Sample{
	public void sample1();
}
interface WithParameter{
	public void sample2(int a);
}
interface WithReturnType{
	public int sample3();
}
interface Addition{
	public int add(int a,int b);
}
public class LambdaExample {

	public static void main(String[] args) {
		Sample obj1=()->{
			System.out.println("I am From Lambda Expression");
		};
		obj1.sample1();
		WithParameter obj2=(a)->{
			System.out.println("I am From Parameter  "+a);
		};
		obj2.sample2(5);
		WithReturnType obj3=()->{
			return 10;
		};
		int a=obj3.sample3();
		System.out.println("This Value From Lambda Expression "+a);
		
		Addition ad=(num1,num2)->{
			int temp=num1+num2;
			System.out.println("Addition Of Two Number id  "+temp);
			return temp;
		};
	}

}
