package thread;

public class TicketBarTest {

	public static void main(String[] args) {

		TicketBar bar = new TicketBar();
		//�Ҧ�bar�o�Ӫ��󪺸귽����"�{��"�B"WEB"�B"�p��"�o�T�ӨӤ�
		Thread t1 = new Thread(bar, "�{��");
		Thread t2 = new Thread(bar, "WEB");
		Thread t3 = new Thread(bar, "�p��");
		t1.start();
		t2.start();
		t3.start();
	}
}
//�p�G�S����w�귽���ܡAA�������run()�]��@�b�N�i��|�QB��run()�m��CPU�A�ɭPA��print�l���o�ӫ��O�i�ੵ�@�q�ɶ��~����
class TicketBar implements Runnable {
	String name;
	static int ticket = 500;//���Lstatic����
	TicketBar() {
	}
	Object key = new Object();
	
	public void run() {
		//synchronized (key) {//key�|��synchronized{}��CPU�@���j�b�@�_�A�N�⤤���h�X���ݮɤ]�|�@���j��(��L������N��m��CPU�]�L�k�Q����)�A����synchronized{}���槹
			while (ticket > 0) {
				synchronized (key) {
					if(ticket>0) {
						ticket--;
						System.out.println(Thread.currentThread().getName() + "��X1�i,�l����:" + ticket);
					}
				}
			}
	}
}