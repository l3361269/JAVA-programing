package project06;
import java.util.*;

public class Quene01 {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();
		q.offer("bbb");
		q.offer("123");
		q.offer("aaa");
		q.offer("KKK");
		q.offer("333");
		q.offer("bbb");
		System.out.println(q);
		System.out.println("�����`�ơG" + q.size());
		
//		Iterator it = q.iterator();
//		while (it.hasNext()) {
//			String d = (String) it.next();
//			System.out.println(d);
//		}
		
		System.out.println("�Ĥ@�Ӹ�Ƭ��G" + q.peek());
		System.out.println(q);
		
		//q.clear();
		//System.out.println("���X�O�_�w�M�šH" + q.isEmpty());
	

	}

}
