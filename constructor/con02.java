package project03;

public class con02 {

	public static void main(String[] args) {
		Member m1=new Member("abc",123);
		Member m2=new Member("def",456);
		System.out.println(m1.money);
		System.out.println(m2.money);
		
		
		//m1.Member("A",144); ->����A�غc�l�u��b�̤@�}�l�ŧi�ܼƮɳQ����
		m2.money=789;
		System.out.println(m2.money);

	}
}
class Member{
	String name;
	int money;
	//�غc�l(constructor)�O�إߪ���ɲĤ@�ӳQ���檺��k
	//�غc�l�bCPU�����B�z�覡�Mmethod���@�s�A����b�e���[�Wvoid�Bstring������
	Member(String name, int money) {	
		this.name = name;
		this.money = money;
		welcome();
	}
	void welcome(){
		System.out.println("Set up successfully");
	}
	
}

