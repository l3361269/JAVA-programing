package thread;

public class TicketBarTest {

	public static void main(String[] args) {

		TicketBar bar = new TicketBar();
		//所有bar這個物件的資源都由"現場"、"WEB"、"小黃"這三個來分
		Thread t1 = new Thread(bar, "現場");
		Thread t2 = new Thread(bar, "WEB");
		Thread t3 = new Thread(bar, "小黃");
		t1.start();
		t2.start();
		t3.start();
	}
}
//如果沒有鎖定資源的話，A執行緒的run()跑到一半就可能會被B的run()搶走CPU，導致A的print餘票這個指令可能延一段時間才執行
class TicketBar implements Runnable {
	String name;
	static int ticket = 500;//有無static都行
	TicketBar() {
	}
	Object key = new Object();
	
	public void run() {
		//synchronized (key) {//key會把synchronized{}跟CPU一直綁在一起，就算中間退出等待時也會一直綁著(其他執行緒就算搶到CPU也無法被執行)，直到synchronized{}執行完
			while (ticket > 0) {
				synchronized (key) {
					if(ticket>0) {
						ticket--;
						System.out.println(Thread.currentThread().getName() + "賣出1張,餘票為:" + ticket);
					}
				}
			}
	}
}