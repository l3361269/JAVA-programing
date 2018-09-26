package Exception;

public class Ex01 {
	
	static void test(int a,int b) {
		int c=(int)(Math.random()*b);//Math.random()產生0~0.99999的隨機亂數
		System.out.println(a/c);
		System.out.println(c);
		System.out.println("123");//因為出現exception而形成其物件卡在記憶體中，底下的這些程式碼都不會被執行
		
		String str="ABF";
		System.out.println(str.charAt(b));
	}

	public static void main(String[] args) {
		try {
			test(2,5);
			System.out.println("456");
		}
		catch(ArithmeticException e) {
			//數學運算錯誤的exception 
			//是最小的子類->要放越前面(不然就被父類include進去)
			//參數exception的物件
			System.out.println("wrong");
		}
		catch(Exception e) {//越父的類 放越後面 //但是如果是同一層子類則沒有這些順問題
			System.out.println("ERROR");
		}
		finally {
			System.out.println("一定會執行");
		}
		
		Ex01 e1=new Ex01();
	}

}
