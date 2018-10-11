package IO;

import java.io.*;;

public class Byte02 {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream fos =new FileOutputStream("info.txt");
		DataOutputStream dos =new DataOutputStream(fos);*/
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("info.txt"));
		//DataOutputStream可以做資料處理再output到file
		//而FileOutputStream無法處料資料類型 給什麼就output進什麼
		
		int i = 100;
		boolean b = true;
		double d = 35.5;
		char c = 'W';
		
		//dos會按照以下的write順序來加入資料
		//因為dos可以進行資料類型處理，所以write方法可以選擇根要output的東西資料型態的方法
		dos.writeBoolean(b);
		dos.writeInt(i);
		dos.writeInt(i);
		dos.writeDouble(d);
		dos.writeChar(c);
		dos.close();//先將處理掉(清空記憶體), 再關閉連接
	}

}
