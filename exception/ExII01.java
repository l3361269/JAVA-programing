package Exception;

public class ExII01 {
	
	//throws �n��->�ᵹ���Өҥ~�h�B�z
	//�n�������e:�Y�ORuntimeException-->�I�s�̥i�������n��
	static void test(int a,int b)throws RuntimeException {
		int c = (int)(Math.random()*b);		
		System.out.println(a/c);	

		String str = "ABCD";
		System.out.println(str.charAt(a));
	}
	//�n�������e:�Y�OException-->�I�s�̤��i�������n��
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