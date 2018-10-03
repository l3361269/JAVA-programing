package project06;

import java.util.ArrayList;

public class Gen03 {
       static void test (ArrayList<? extends A> a1) {
			System.out.println(a1);
		}
	public static void main(String[] args) {
		ArrayList arr1=new ArrayList(); //只接受object
		ArrayList<A> arrA=new ArrayList<A>();//只接受A、B、C
		ArrayList<B> arrB=new ArrayList<B>();//只接受B、C
		ArrayList<C> arrC=new ArrayList<C>();//只接受C
		
		arr1.add(new A());
		arr1.add("JAVA");
		//arrA.add(A a);
		arrA.add(new A());
		arrA.add(new B());
		arrA.add(new C());
		
		arrB.add(new B());
		arrB.add(new C());
		
		arrC.add(new C());
		
		test(arr1);
		test(arrA);
		//test(arrB);
		//test(arrC);
		

	}

}
class A{}
class B extends A{}
class C extends B{}