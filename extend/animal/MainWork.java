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
		//animal a=new animal()-->�h��
		//animal�o�Ӥ������U�����i�H��
		MainWork.take(new cat());//animal a=new cat()
		MainWork.take(c);
		MainWork.take(new dog());//animal a=new dog()
		MainWork.take(d);
		
		//-----
		
		//MainWork.take2(new A());//-->ERROR:�]��A�OC������������(A�bC�W�h)
		// MainWork.take2(new B());//-->ERROR:�]��B�OC������(B�bC�W�h)
		MainWork.take2(new C());
		
	}

}
class A{}
class B extends A{}
class C extends B{}