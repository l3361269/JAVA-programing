package B;

//import A.child; ->ERROR:�o��class���Opublic�A�ҥH�O��package�����
import A.mother;

public class Run {

	public static void main(String[] args) {
		mother m=new mother();
		//child c1=new child();
		
		System.out.println(m.name); //m�u��name�i�H��

	}

}
