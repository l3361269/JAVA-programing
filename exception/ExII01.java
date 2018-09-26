package Exception;

public class ExII01 {
	
	//throws 聲明->丟給那個例外去處理
	//聲明的內容:若是RuntimeException-->呼叫者可忽略此聲明
	static void test(int a,int b)throws RuntimeException {
		int c = (int)(Math.random()*b);		
		System.out.println(a/c);	

		String str = "ABCD";
		System.out.println(str.charAt(a));
	}
	//聲明的內容:若是Exception-->呼叫者不可忽略此聲明
	static void test2(int a,int b)throws Exception {
		int c = (int)(Math.random()*b);		
		System.out.println(a/c);	

		String str = "ABCD";
		System.out.println(str.charAt(a));
	}

	public static void main(String[] args){
		try {
			test(4,2);
			test2(4,2);
		}catch(RuntimeException e) {
			
		}
		catch(Exception e) {
			
		}
	}

}