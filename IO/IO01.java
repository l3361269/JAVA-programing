package IO;
import java.io.*;
public class IO01 {

	public static void main(String[] args) {
		File dir=new File("c:\\aa\\bb");//���إ�/�T�{���|������  //�O�o�O�n��ӭ˱׽u"\\"(�]���@�ӬO����r��)
		//�g�k: File dir=new File("c:"+File.separator+"aa"+File.separator+"bb")
		//->�o�ˤ��ިϥέ��ا@�~�t�γ��i�H���Ӹ��|(�]�����P�@�~�t�Ϊ����|�g�k�i�ण�P)
		File file=new File(dir,"abc.txt");//�A�إߥؼХؿ��ɮת�����
				
		try {
			if(dir.exists()) {
				file.createNewFile();
				//����o��method()�~�|�إ�file�n�ާ@��"abc.txt"�o���ɮ� 
				//�^��boolean��
			}
			else {
				dir.mkdirs();//make directions:�إߥؼХؿ����Ҧ����|
				file.createNewFile();
			}
				
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
}
