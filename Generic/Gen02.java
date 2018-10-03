package project06;

import java.util.ArrayList;
//泛型:指定類型
public class Gen02 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();//new這邊的<>可不用填入，但好習慣要留著<>
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
