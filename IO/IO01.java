package IO;
import java.io.*;
public class IO01 {

	public static void main(String[] args) {
		File dir=new File("c:\\aa\\bb");//先建立/確認路徑的物件  //記得是要兩個倒斜線"\\"(因為一個是跳脫字元)
		//寫法: File dir=new File("c:"+File.separator+"aa"+File.separator+"bb")
		//->這樣不管使用哪種作業系統都可以找到該路徑(因為不同作業系統的路徑寫法可能不同)
		File file=new File(dir,"abc.txt");//再建立目標目錄檔案的物件
				
		try {
			if(dir.exists()) {
				file.createNewFile();
				//執行這個method()才會建立file要操作的"abc.txt"這個檔案 
				//回傳boolean值
			}
			else {
				dir.mkdirs();//make directions:建立目標目錄的所有路徑
				file.createNewFile();
			}
				
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
}
