package extend;

public class phone01 {
	float size=4.7F;//�p�Ʀ���اΦ�:double(8 byte)�Bfloat(4 byte)�A�n���w�p�Ƭ�float���A�N�n�b�Ʀr�᭱�[�W"F"
	private int RAM=2;
	int px=700;
	phone01(int RAM){
		System.out.println("phone01 OK");//constructor�u��ۤvclass�ΡA���ݩʡB��k�i�H���O�H�~��
	}
	
	final void open() {//void�M��k�@�w�n�g�b�@�_(��^�ȩM��k�n�g�b�@�_)
		System.out.println(size+"/"+RAM+"/"+px);
	}

}
