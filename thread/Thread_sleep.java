package thread;

public class Thread_sleep {

	public static void main(String[] args) throws Exception{//由JVM推送
		Ex04 ex01 = new Ex04();
		ex01.start();//推送新任務(Thread)->CPU
		
		//main
		for(int i=1;i<=2000;i++) {
			System.out.println("main-->"+i);
		}
	}
}
//包括 通道+任務
class Ex04 extends Thread{
	public void run() {
		for(int i=5;i>=1;i--) {
			System.out.println(i+" 秒...");
			try {
				Thread.sleep(1000);//到阻塞區睡1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}