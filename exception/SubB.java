package Exception;
//Override-->�l�����k���W�h
//�s���v��:�l>=��
//�J���n���ҥ~��:�l<=��
//-->�Y�ORuntimeException:���ޤW�@����Ѽg���W�h
//-->�Y�OException:�@�w�n�ޤW�W�@����Ѽg���W�h

class X {
	public void foo() {
		System.out.print("X ");
	}
}

public class SubB extends X {
	public void foo() throws RuntimeException {//�l����throw�n���h�Ť@�w�n<=������
		super.foo();//�]�^�h���������
		if (true)
			{
			throw new RuntimeException();
			}
		System.out.print("B ");
	}

	public static void main(String[] args) {
		new SubB().foo();
	}
}

