package thread;

public class Thread_sleep {

	public static void main(String[] args) throws Exception{//��JVM���e
		Ex04 ex01 = new Ex04();
		ex01.start();//���e�s����(Thread)->CPU
		
		//main
		for(int i=1;i<=2000;i++) {
			System.out.println("main-->"+i);
		}
	}
}
//�]�A �q�D+����
class Ex04 extends Thread{
	public void run() {
		for(int i=5;i>=1;i--) {
			System.out.println(i+" ��...");
			try {
				Thread.sleep(1000);//�����Ϻ�1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}