package project06;

public class Gen01 {
//�x��:���w����
	public static void main(String[] args) {
		Drink<Integer> d1=new Drink<Integer>();//<>���n��J���󵥯Ū������A�ҥH�OInteger(���Oint)
		d1.price=50;
		
		Drink d2=new Drink();//�S�����w<>�O����A�h�����w���A�����ӪF�誺���A�N�Oobject
		d2.price=50;
		//d2.price+=5;//ERROR:����S�k���B��

	}

}
class Drink<T>{ //<>�O���w�n�O�������������N��AT�O�H�K�g��(���O�`�gT��E)�A�]�i�H�Oa����
	String name;
	T price;//�]��price����������٤��T�w �ҥH��T�o���٤����w������
}
