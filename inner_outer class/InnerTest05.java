package project05;

public class InnerTest05 {

	public static void main(String[] args) {
		//new Outer02();
		Outer02 o2=new Outer02();
		o2.test01();
		

	}

}
class Outer02{
	int a=5;
	void test01() {
		int a =6; //如果專案版本是1.7就要加上final才行被內部類的方法用，而android是使用1.7版，所以也是這樣
		class Inner02{
			//int a=7;
			void test02() {
				//int a=8;
				System.out.println(a);
			}
		}
		new Inner02().test02();
	}
	/*Inner02 a=new Inner02();
	a.test02();->ERROR:因為內部類是定義在方法中，出了方法就不能用了(不管是屬性、類都不能用)*/
}
