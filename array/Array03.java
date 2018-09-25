package project05;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		students[] D101=new students[5]; //宣告一個students class類型的array
		D101[0]=new students("a",1);//再建立出array中每個element的物件(要符合students的要求)(因為array中每個element的資料型態要相同)
		D101[1]=new students("b",2);
		D101[2]=new students("c",3);
		D101[3]=new students("d",4);
		D101[4]=new students("e",5);
		
		for(students i:D101) {//用一個相同資料型態的變數來裝array的每一次的值(i=D101[a];a++)
			if(i.score>=4) {
				System.out.println(i.name+" A class");//sysout(a資料型態+b資料型態)
			}
			else if(i.score>=2)
			{
				System.out.println(i.name+" B class");
			}
			else {
					System.out.println(i.name+" C class");
				}
			
		}
		
		int[] arr= {1,2,3,4,5};
		int[] a2=Arrays.copyOf(arr, 4);
		for(int i:a2)
		{
			System.out.println(i);
		}
		
		

	}
	
}
	class students{
		String name;
		int score;
		
		public students(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}
		
	}


