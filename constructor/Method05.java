package project03;

public class Method05 {
	public static void main(String[] args) {
		//c1�N��Car�o��class, �i�޲z new Car�������Ŷ�
		//Car�Ŷ������G�m,�HCar()���D
		car c1=new car();//��غc�l(car())�L�ѼƮ�,�i�ٲ�
		car c2=new car("��");
		c1.color="y";
		System.out.println(c1.color);
		System.out.println(c2.color);
	}

}
class car{ //public��class�u��b�L�ۤv��file��(�]�N�O���@��file�u�঳�@��public��class)
	String color="��";
	
	car(){} //�غc�l 
	//�غc�l�����Mclass�W�٬ۦP
	//�Y�S���w�q�غc�l,JVM(�����D��)�|�۰ʸɤW�L�Ѽƪ��غc�l(�w�]�غc�l->car(){})
	car(String c){
		this.color=c;
	}
}
