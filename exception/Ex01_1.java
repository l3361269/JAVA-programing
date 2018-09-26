package Exception;

public class Ex01_1 {
	
	static void test(int a,int b) {
		try {
			int c=(int)(Math.random()*b);//Math.random()產生0~0.99999的隨機亂數
			System.out.println(a/c);
			System.out.println(c);
			System.out.println("123");//因為出現exception而形成其物件卡在記憶體中，底下的這些程式碼都不會被執行
			
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
