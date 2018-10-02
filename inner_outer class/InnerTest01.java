package project05;

public class InnerTest01 {

	public static void main(String[] args) {
		Outer01.Inner01 i=new Outer01().new Inner01();
		i.getA();
		
		Outer01 o1=new Outer01();
		Outer01.Inner01 i1=o1.new Inner01();
		Outer01.Inner01 i2=o1.new Inner01();
		o1.getA();

	}

}

class Outer01{//外部類
	int b= 100;
	void getA() {
		int b=499;
		System.out.println("外部類中方法的區域變數: "+b); //499
		System.out.println("外部類中的屬性變數: "+this.b);//100 (this:此方法所在的class的物件)
		System.out.println("內部類中的屬性變數: "+new Inner01().b);//500 (內部類較低一階，所以要建立內部類物件)
		//外部類無法取得內部類中方法的區域變數(999)
	}
	class Inner01{ //內部類
		private int b=500;
		
		void getA() {
			int b=999;
			System.out.println("內部類中方法的區域變數: "+b); //999
			System.out.println("內部類中的屬性變數: "+this.b);//500 (this:此方法所在的class的物件)
			System.out.println("外部類中的屬性變數: "+Outer01.this.b);//100 (this:等於該class的物件記憶體(所以不須先建立該class的物件))
		    //內部類無法取得外部類中方法的區域變數(499)
		}
	}
}
