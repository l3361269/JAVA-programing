package project06;

import java.util.ArrayList;
//�x��:���w����
public class Gen02 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();//new�o�䪺<>�i���ζ�J�A���n�ߺD�n�d��<>
		a1.add("JAVA");
		//a1.add(123);
		a1.add("JSP");
		a1.add("ANDROID");
		System.out.println(a1);
		
		for(String s:a1) {
			System.out.println(s.toLowerCase());
		}
		

	}

}
