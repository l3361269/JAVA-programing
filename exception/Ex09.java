package Exception;
public class Ex09 {
	public static void main(String[] args) {
		//������ҬO�_�q�L
		boolean verify = true;
		try {
			checkMemberID("1234545545");
		} catch (IDException e) {
			System.out.println("���~�T�� : " + e.getMessage());
			e.contactWith(); // ����ۭq��k
			verify = false;//������Ҥ��q�L
		}
		//�p�G���ҳq�L
		if (verify) {
			System.out.println("�|���Ҹ����Ҧ��\ !");
		} else {
			System.out.println("�|���Ҹ����ҥ��� !");
		}
	}
	//�P�_���Ҫ��覡
	public static void checkMemberID(String mID) throws IDException {
		if (mID.length() != 5) {
			throw new IDException(mID);
		}
	}
}
//�ۭq�ҥ~���O
class IDException extends Exception {
	public IDException(String mID) {
		super("�|���Ҹ� " + mID + " ���ҥ��� !");
	}
	public void contactWith() {
		System.out.println("�гs���A�ȤH��=> Tel:02-2222-3333");
	}
}