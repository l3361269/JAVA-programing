package IO;
import java.io.*;

public class IO02 {

	public static void main(String[] args) {
		File f=new File("src\\IO\\JAVA.txt");//�S���ڥؿ�->���M�פU�����|
		
		if(f.exists()) {
			if(f.isDirectory()) { //directory:���|�ؿ�(��Ƨ�)
				System.out.println("this is a "+f.getName()+" directory");
				String[] s=f.list();//��Ӹ��|��Ƨ������ɮצC��s�U�ӡA�åHstring�����x�s
				for (int i=0;i<s.length;i++) {
					if(s[i].startsWith("IO")) {
						System.out.println(s[i]);
					}
				}
			}
			else if (f.isFile()) {
				System.out.println("this is a "+f.getName()+" file");
				System.out.println("�o�O" + f.getName() + "�ɮ�!");
				System.out.println("�O�_�iŪ��:" + f.canRead());
				System.out.println("�O�_�i�g�J:" + f.canWrite());
				System.out.println("������|:" + f.getAbsolutePath());//���o�b�q���w�Ф������|
				System.out.println("�W�@�h�ؿ�:" + f.getParent());//�W�h�ؿ���parent
				System.out.println("�O�_��������:" + f.isHidden());
				System.out.println("��Ƨ����ɮת�����:" + f.length());//�j�p��byte
			} else {
				System.out.println(f + "���s�b!");
				
			}
		}

	}

}
