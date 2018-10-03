package extend;

import extend.dog.dog;
import extend.cat.cat;

public class MainWork {
	static void take(animal a) {
		System.out.println("ok");
	}
	
	static void take2(B c) {
		System.out.println("ok");
	}

	public static void main(String[] args) {
		dog d=new dog();
		cat c=new cat();
		animal a=new animal();
		animal b=new dog();
		animal e=new cat();
		
		MainWork.take(a);
		MainWork.take(new animal());
		//animal a=new animal()-->多型
		//animal這個父類底下的都可以用
		MainWork.take(new cat());//animal a=new cat()
		MainWork.take(c);
		MainWork.take(new dog());//animal a=new dog()
		MainWork.take(d);
		
		//-----
		
		//MainWork.take2(new A());//-->ERROR:因為A是C的父類的父類(A在C上層)
		// MainWork.take2(new B());//-->ERROR:因為B是C的父類(B在C上層)
		MainWork.take2(new C());
		
	}

}
class A{}
class B extends A{}
class C extends B{}