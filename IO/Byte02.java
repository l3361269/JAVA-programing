package IO;

import java.io.*;;

public class Byte02 {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream fos =new FileOutputStream("info.txt");
		DataOutputStream dos =new DataOutputStream(fos);*/
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("info.txt"));
		//DataOutputStream�i�H����ƳB�z�Aoutput��file
		//��FileOutputStream�L�k�B�Ƹ������ ������Noutput�i����
		
		int i = 100;
		boolean b = true;
		double d = 35.5;
		char c = 'W';
		
		//dos�|���ӥH�U��write���Ǩӥ[�J���
		//�]��dos�i�H�i���������B�z�A�ҥHwrite��k�i�H��ܮڭnoutput���F���ƫ��A����k
		dos.writeBoolean(b);
		dos.writeInt(i);
		dos.writeInt(i);
		dos.writeDouble(d);
		dos.writeChar(c);
		dos.close();//���N�B�z��(�M�ŰO����), �A�����s��
	}

}
