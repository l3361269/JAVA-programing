package project05;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		students[] D101=new students[5]; //�ŧi�@��students class������array
		D101[0]=new students("a",1);//�A�إߥXarray���C��element������(�n�ŦXstudents���n�D)(�]��array���C��element����ƫ��A�n�ۦP)
		D101[1]=new students("b",2);
		D101[2]=new students("c",3);
		D101[3]=new students("d",4);
		D101[4]=new students("e",5);
		
		for(students i:D101) {//�Τ@�ӬۦP��ƫ��A���ܼƨӸ�array���C�@������(i=D101[a];a++)
			if(i.score>=4) {
				System.out.println(i.name+" A class");//sysout(a��ƫ��A+b��ƫ��A)
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


