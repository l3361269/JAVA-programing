package thread;


public class Thread_join {

	public static void main(String[] args)throws Exception{//由JVM推送
		
				
		Ex03 ex01 = new Ex03();
		ex01.start();//推送新任務(Thread)->CPU
		ex01.join();//阻斷正在執行的執行緒(這裡是main)，值到此執行緒(ex01)執行完畢才換被join的執行緒(main)繼續執行
		
		Ex03 ex02 = new Ex03();
		ex02.start();
		
		//main
		for(int i=1;i<=2000;i++) {
			System.out.println("main-->"+i);
			}

			
	}		
}
//包括 通道+任務
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
