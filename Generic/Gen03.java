package project06;

import java.util.ArrayList;

public class Gen03 {
       static void test (ArrayList<? extends A> a1) {
			System.out.println(a1);
		}
	public static void main(String[] args) {
		ArrayList arr1=new ArrayList(); //�u����object
		ArrayList<A> arrA=new ArrayList<A>();//�u����A�BB�BC
		ArrayList<B> arrB=new ArrayList<B>();//�u����B�BC
		ArrayList<C> arrC=new ArrayList<C>();//�u����C
		
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