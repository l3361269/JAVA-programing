package Exception;
public class ExII02 {
	
	static void test()throws RuntimeException,Exception{
		
		System.out.println("test OK");
		throw new Exception();//�@�w�|�����X�ҥ~����
	}
	
	

	public static void main(String[] args)throws Exception{
		test();
	}
}