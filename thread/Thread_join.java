package thread;


public class Thread_join {

	public static void main(String[] args)throws Exception{//��JVM���e
		
				
		Ex03 ex01 = new Ex03();
		ex01.start();//���e�s����(Thread)->CPU
		ex01.join();//���_���b���檺�����(�o�̬Omain)�A�Ȩ즹�����(ex01)���槹���~���Qjoin�������(main)�~�����
		
		Ex03 ex02 = new Ex03();
		ex02.start();
		
		//main
		for(int i=1;i<=2000;i++) {
			System.out.println("main-->"+i);
			}

			
	}		
}
//�]�A �q�D+����
class Ex03 extends Thread{
	public void run() {
		for(int i=1;i<=2000;i++) {
			System.out.println(
					Thread.currentThread().getName()
					+"-->"
					+i);
		}
	}
}
