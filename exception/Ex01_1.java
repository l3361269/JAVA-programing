package Exception;

public class Ex01_1 {
	
	static void test(int a,int b) {
		try {
			int c=(int)(Math.random()*b);//Math.random()����0~0.99999���H���ü�
			System.out.println(a/c);
			System.out.println(c);
			System.out.println("123");//�]���X�{exception�ӧΦ��䪫��d�b�O���餤�A���U���o�ǵ{���X�����|�Q����
			
			String str="ABF";
			System.out.println(str.charAt(b));
		}
			
		catch(ArithmeticException e){
		    System.out.println("math ok");
		   // System.out.println(e.getMessage());
		    //e.printStackTrace();
		    System.out.println(e.toString());
		}
		catch(StringIndexOutOfBoundsException e){
		    System.out.println("str ok");
		}
		catch(Exception e) {
			System.out.println("inner method has been handled");
		}
		System.out.println("789");
	}

	public static void main(String[] args) {
		test(3,0);
		
	}

}
