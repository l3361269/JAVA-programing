package Exception;
public class ExII02 {
	
	static void test()throws RuntimeException,Exception{
		
		System.out.println("test OK");
		throw new Exception();//一定會執行丟出例外物件
	}
	
	

	public static void main(String[] args)throws Exception{
		test();
	}
}