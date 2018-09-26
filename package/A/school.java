package A; //一定要在最上面，絕對不能刪

import B.student; //不同package要互相存取，要先import進來

public class school {
	private String schoolName="XX";
	
	public static void main(String[] args) {
		school s=new school();
		System.out.println(s.schoolName);
		
		student s1=new student();
		System.out.println(s1.studentName); //B的studentName要是public才能這樣直接用
		s1.getPW(); 
		//B.pw是private不能直接存取，但可透過B.getPW這個public的method來間接取得pw
		
		car c=new car();//自己package的所有class不管存取權限為何 都可以互相使用
		//System.out.println(c.no); //private不能在不同class使用
	}

}

//----------------

class car{
	private String no="123";
}
