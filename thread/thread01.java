package thread;

public class thread01 {

	public static void main(String[] args) {//���@�Ӱ����//��JVM���e
		
		//�s��:thread0
		Ex01 ex01 = new Ex01();//����+�q�D
		//�إ߷s������@�w�n��.start()�o��k�өI�s����run()�A�H�Ұʰ�������B�@
		ex01.start();//���e�s����(Thread)��CPU
		//ex01.start();//���e�s����(Thread)��CPU
		
		//�s��:thread1
		Ex01 ex02 = new Ex01();
		ex02.setPriority(10);//Thread-1�����u�������v
		ex02.start();
		
		//main
		for(int i=1;i<=3000;i++) {
			System.out.println("main-->"+i);
		}
		
		//(�s��thread3)�R�W��T1
		Ex02 e2 = new Ex02();//����
		Thread t1=new Thread(e2,"T1");//�q�D
		t1.start();

	}
}
//----------------------
//�]�A  ����+�q�D
class Ex01 extends Thread{
	public void run() {
		for(int i=1;i<=3000;i++) {
			System.out.println(
					Thread.currentThread().getName()
					+"-->"
					+i);
		}
	}
}
//�]�A ����
//�]��JAVA���h���~�Ӫ�����A�ҥH�o�̥�implements Runnable�o����
class Ex02 implements Runnable{
	public void run() {
		for(int i=1;i<=3000;i++) {
			System.out.println(
					Thread.currentThread().getName()
					+"-->"
					+i);
		}
	}
}
