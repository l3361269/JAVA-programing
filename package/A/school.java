package A; //�@�w�n�b�̤W���A���藍��R

import B.student; //���Ppackage�n���ۦs���A�n��import�i��

public class school {
	private String schoolName="XX";
	
	public static void main(String[] args) {
		school s=new school();
		System.out.println(s.schoolName);
		
		student s1=new student();
		System.out.println(s1.studentName); //B��studentName�n�Opublic�~��o�˪�����
		s1.getPW(); 
		//B.pw�Oprivate���ઽ���s���A���i�z�LB.getPW�o��public��method�Ӷ������opw
		
		car c=new car();//�ۤvpackage���Ҧ�class���ަs���v������ ���i�H���ۨϥ�
		//System.out.println(c.no); //private����b���Pclass�ϥ�
	}

}

//----------------

class car{
	private String no="123";
}
