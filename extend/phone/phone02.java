package extend;

public final class phone02 extends phone01{//class �p�Gfinal�h�~�Ӧ�����������A��惡��
	private int px=1300;//�l���i�H�ק�������ݩ�(���O�@�˭n�ŧi�ܼ�)
	float size=5.5F;
	//�l���M�������ݩʬO�}��Ӥ��P������O����h�إߪ��A�ҥH�ݩʦb�w�q�ɬO���ۿW�ߪ��A�]���l���w�q���ݩʷ|���N���������ݩ�
	phone02(){
		//super();//(�o�ӥi�H�ٲ��A�{���|�ۤv�ɤW)�N��W�@�hclass���غc�l
		super(4);//�p�G�W�@�h�������n�ǤJ�ѼơA�o�̬A���N�n��J�Ѽƭ�
		//super�u��Φb�l���̭�
		System.out.println("phone02 ok");
	}
	/*void open(){//phone01��open��final�A�Ӧ]����k���O����u���@�Ӥ@�_�@�ΡA�ҥH�l���N����A���w�q
		System.out.println(size+"/"+RAM+"/"+px);//�p�G�������w�qprivate����M�D�������a�賣����print�Xprivate��
	}*/
	void open(int i) {
		//����k�������open()���@�ˡA�ҥH��������final����
	}

}
