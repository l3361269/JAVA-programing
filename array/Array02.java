package project05;

public class Array02 {

	public static void main(String[] args) {
		String[] s1= {"JAVA","C++","android",null,null};
		System.out.println(s1);//Ū��s1���O�����}
		//null�O�@�ت���(���iint i=null)�A��ܨS����
		s1[3]="C#";
		s1[4]="JSP";
		//��for��Ū��s1���C��element����
		for(int i=0;i<s1.length;i++) //s1.length�O�ݩ�(���O��k)
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
		
		//�ĤG��for�g�k-->for-each:�u��ΦbJAVA�BJACA web�Bandroid�~�i��
		for(String a:s1) {
			if(a.endsWith("#"))
			{System.out.println(a);
		}

	}

}
}
