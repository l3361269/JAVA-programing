package project06;
import java.util.*;
public class LinkHashSet01 {

	public static void main(String[] args) {
		test(new HashSet());//�S���̶���
		test(new LinkedHashSet());//�̶��� 
	}

	public static void test(Set set) { //�ѼƬOSet(�O����(�ҥH�䩳�U�l�����i�H))������(HashSet,LinkedHashSet�O��l��)
		System.out.println("\n" + set.getClass().getName());
		for (int i = 100; i <= 110; i++) {
			set.add(i);//100,101...110
		}
		set.add(108);//X
		set.add(101);//X
		set.add(118);//OK
		
		for (Iterator it = set.iterator();it.hasNext();) {//�@�ˬOfor(;;)�����c�A�u�O�]����iterator���N�F�ҥH�̫�@�����μg
			System.out.print(it.next() + "\t"); //�]�����P�_hasNext()�A�ҥH���ЬO�b�Ĥ@�Ӥ������̫e���A�ҥH.next�O�^�ǫ��Ъ��U�@�Ӥ]�N�O�Ĥ@��element
		}
		
	}
}