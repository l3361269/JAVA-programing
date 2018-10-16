package thread;
class FatherThread implements Runnable {
	public void run() {
		System.out.println("爸爸下班回家.");
		System.out.println("爸爸準備洗澡.");
		System.out.println("爸爸發現沒瓦斯了.");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯.");
		//建立執行緒物件-->瓦斯工人的
		Thread worker = new Thread(new WorkerThread());
		System.out.println("爸爸等待瓦斯工人...");
		//啟動瓦斯工人執行緒
		worker.start(); 
		//Thread.yield();//讓:將正在執行的執行緒退回準備區，CPU重新叫任一執行緒來執行(可能會叫到剛剛正在執行的(等於沒讓到))
		try {			
			//父親睡(等)5.5秒
			//Thread.sleep(5500);//睡超過WorkerThread的時間就一定不會插隊了(但這樣需要先知道該執行緒所需時間)
			//所以用.join()->worker干涉FatherThread, 一直到worker執行完
			worker.join();
			
		} catch (InterruptedException e) {
			System.out.println("爸爸決定今天不洗熱水澡了!");
		}
		System.out.println("爸爸開始洗澡!");
		System.out.println("爸爸洗完澡了!");
	}
}
//瓦斯工人
class WorkerThread implements Runnable {
	public void run() {
		System.out.println();
		System.out.println("瓦斯工人送瓦斯中... ");
		//模擬送貨...
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.print(i + " 分鐘, ");
			}
		} catch (InterruptedException ie) {
			System.err.println("瓦斯工人送瓦斯途中發生意外!");
		}
		System.out.println();
		System.out.println("瓦斯工人將瓦斯送到家了!");
		System.out.println("瓦斯工人將瓦斯安裝完畢!");
		System.out.println();
	}
}
//main()
public class Th03 {
	public static void main(String[] args) {
		Thread father = new Thread(new FatherThread());
		father.start();
	}
}