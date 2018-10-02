package project05;

public class InnerTest02 {

	public static void main(String[] args) {
		AA a =new AA() {//inerface可以被建立物件，但是要以override的方式->new 建構子(){override};
			int t=100;

			@Override  //按右鍵->source->override/implement
			//在override的interface的方法才完成其內容
			public void test() {
				System.out.println("ok");
				
			}
			
		};//注意;!!!!!! 這樣才對
		//System.out.println(a.t); ->ERROR:只能用interface定義的東西

	}

}
interface AA{
	void test();//因為interface是不完整的結構，所以其方法不能有{}，而是直接;
}
