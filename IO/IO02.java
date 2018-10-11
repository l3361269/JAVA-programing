package IO;
import java.io.*;

public class IO02 {

	public static void main(String[] args) {
		File f=new File("src\\IO\\JAVA.txt");//沒有根目錄->此專案下的路徑
		
		if(f.exists()) {
			if(f.isDirectory()) { //directory:路徑目錄(資料夾)
				System.out.println("this is a "+f.getName()+" directory");
				String[] s=f.list();//把該路徑資料夾中的檔案列表存下來，並以string類型儲存
				for (int i=0;i<s.length;i++) {
					if(s[i].startsWith("IO")) {
						System.out.println(s[i]);
					}
				}
			}
			else if (f.isFile()) {
				System.out.println("this is a "+f.getName()+" file");
				System.out.println("這是" + f.getName() + "檔案!");
				System.out.println("是否可讀取:" + f.canRead());
				System.out.println("是否可寫入:" + f.canWrite());
				System.out.println("絕對路徑:" + f.getAbsolutePath());//取得在電腦硬碟中的路徑
				System.out.println("上一層目錄:" + f.getParent());//上層目錄為parent
				System.out.println("是否為隱藏檔:" + f.isHidden());
				System.out.println("資料夾或檔案的長度:" + f.length());//大小為byte
			} else {
				System.out.println(f + "不存在!");
				
			}
		}

	}

}
