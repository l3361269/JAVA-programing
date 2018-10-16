package thread;

public class thread01 {

	public static void main(String[] args) {//為一個執行緒//由JVM推送
		
		//編號:thread0
		Ex01 ex01 = new Ex01();//任務+通道
		//建立新執行緒一定要用.start()這方法來呼叫物件的run()，以啟動執行緒的運作
		ex01.start();//推送新任務(Thread)給CPU
		//ex01.start();//推送新任務(Thread)給CPU
		
		//編號:thread1
		Ex01 ex02 = new Ex01();
		ex02.setPriority(10);//Thread-1取高優先執行權
		ex02.start();
		
		//main
		for(int i=1;i<=3000;i++) {
			System.out.println("main-->"+i);
		}
		
		//(編號thread3)命名為T1
		Ex02 e2 = new Ex02();//任務
		Thread t1=new Thread(e2,"T1");//通道
		t1.start();

	}
}
//----------------------
//包括  任務+通道
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
//包括 任務
//因為JAVA有多重繼承的限制，所以這裡用implements Runnable這個類
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
