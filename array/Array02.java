package project05;

public class Array02 {

	public static void main(String[] args) {
		String[] s1= {"JAVA","C++","android",null,null};
		System.out.println(s1);//讀取s1的記憶體位址
		//null是一種物件(不可int i=null)，表示沒有值
		s1[3]="C#";
		s1[4]="JSP";
		//用for來讀取s1的每個element的值
		for(int i=0;i<s1.length;i++) //s1.length是屬性(不是方法)
		{
			if(s1[i].startsWith("J"))//startsWith(string)
			{
				System.out.println(s1[i]);
			}
			if(s1[i].endsWith("d"))//endsWith(string)
			{
				System.out.println(s1[i+1]);
			}
			
			//System.out.println(s1[i]);
		}
		
		//第二種for寫法-->for-each:只能用在JAVA、JACA web、android才可用
		for(String a:s1) {
			if(a.endsWith("#"))
			{System.out.println(a);
		}

	}

}
}
