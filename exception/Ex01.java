package Exception;

public class Ex01 {
	
	static void test(int a,int b) {
		int c=(int)(Math.random()*b);//Math.random()����0~0.99999���H���ü�
		System.out.println(a/c);
		System.out.println(c);
		System.out.println("123");//�]���X�{exception�ӧΦ��䪫��d�b�O���餤�A���U���o�ǵ{���X�����|�Q����
		
		String str="ABF";
		System.out.println(str.charAt(b));
	}

	public static void main(String[] args) {
		try {
			test(2,5);
			System.out.println("456");
		}
		catch(ArithmeticException e) {
			//�ƾǹB����~��exception 
			//�O�̤p���l��->�n��V�e��(���M�N�Q����include�i�h)
			//�Ѽ�exception������
			System.out.println("wrong");
		}
		catch(Exception e) {//�V������ ��V�᭱ //���O�p�G�O�P�@�h�l���h�S���o�Ƕ����D
			System.out.println("ERROR");
		}
		finally {
			System.out.println("�@�w�|����");
		}
		
		Ex01 e1=new Ex01();
	}

}
