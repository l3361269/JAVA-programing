package IO;
import java.io.*;
public class Byte01 {

	public static void main(String[] args) throws IOException {
		//通常做位元組傳輸，會叫做Stream
		//以常見的字串傳輸，會叫做Reader/Writer
		//舉例來說，FileInputStream是做檔案位元輸入的類別；InputStreamReader是做字串輸入的類別
		FileInputStream fis = new FileInputStream("src\\IO\\IO01.java");
		FileOutputStream fos=new FileOutputStream("abc.txt",true);//第二個參數(optional)true->保留舊的東西不被新的覆寫 
		
		//FileInputStream.read()讀下一個資料(一次讀1 byte)，
		//並轉成int資料類型(轉換類型時先放在記憶體大的才不會轉換錯誤)(也就是回傳ASCII)

		/*
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}*/
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			fos.write(i);//.write()會把參數資料型態轉換成byte
		}
		
		byte[] b=new byte[20];
		//建立一個byte array，長度為20，用來緩衝儲存最多20個byte的資料
		//但通常長度會設為2的次方 例如256,512,1024
		int a;//.read(b)回傳的數量
		
		while((a=fis.read(b))!=-1) {//.read(b):把b長度byte的資料讀進來放進b這個緩衝區(且資料類型都轉成byte)
			System.out.println(a);
			System.out.println(new String(b));//因為沒有string(byte[])的method
			fos.write(b);
		}
		
		//記得關掉檔案!!!!!!!!!!!!!!!!
		fos.close();
		fis.close();
		//先清空stream的記憶體，再斷開連結

	}

}
