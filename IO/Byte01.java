package IO;
import java.io.*;
public class Byte01 {

	public static void main(String[] args) throws IOException {
		//�q�`���줸�նǿ�A�|�s��Stream
		//�H�`�����r��ǿ�A�|�s��Reader/Writer
		//�|�Ҩӻ��AFileInputStream�O���ɮצ줸��J�����O�FInputStreamReader�O���r���J�����O
		FileInputStream fis = new FileInputStream("src\\IO\\IO01.java");
		FileOutputStream fos=new FileOutputStream("abc.txt",true);//�ĤG�ӰѼ�(optional)true->�O�d�ª��F�褣�Q�s���мg 
		
		//FileInputStream.read()Ū�U�@�Ӹ��(�@��Ū1 byte)�A
		//���নint�������(�ഫ�����ɥ���b�O����j���~���|�ഫ���~)(�]�N�O�^��ASCII)

		/*
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}*/
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			fos.write(i);//.write()�|��ѼƸ�ƫ��A�ഫ��byte
		}
		
		byte[] b=new byte[20];
		//�إߤ@��byte array�A���׬�20�A�Ψӽw���x�s�̦h20��byte�����
		//���q�`���׷|�]��2������ �Ҧp256,512,1024
		int a;//.read(b)�^�Ǫ��ƶq
		
		while((a=fis.read(b))!=-1) {//.read(b):��b����byte�����Ū�i�ө�ib�o�ӽw�İ�(�B����������নbyte)
			System.out.println(a);
			System.out.println(new String(b));//�]���S��string(byte[])��method
			fos.write(b);
		}
		
		//�O�o�����ɮ�!!!!!!!!!!!!!!!!
		fos.close();
		fis.close();
		//���M��stream���O����A�A�_�}�s��

	}

}
