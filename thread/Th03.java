package thread;
class FatherThread implements Runnable {
	public void run() {
		System.out.println("�����U�Z�^�a.");
		System.out.println("�����ǳƬ~��.");
		System.out.println("�����o�{�S�˴��F.");
		System.out.println("�������q�ܽХ˴��u�H�e�˴�.");
		//�إ߰��������-->�˴��u�H��
		Thread worker = new Thread(new WorkerThread());
		System.out.println("�������ݥ˴��u�H...");
		//�Ұʥ˴��u�H�����
		worker.start(); 
		//Thread.yield();//��:�N���b���檺������h�^�ǳưϡACPU���s�s���@������Ӱ���(�i��|�s���西�b���檺(����S����))
		try {			
			//���˺�(��)5.5��
			//Thread.sleep(5500);//�ζW�LWorkerThread���ɶ��N�@�w���|�����F(���o�˻ݭn�����D�Ӱ�����һݮɶ�)
			//�ҥH��.join()->worker�z�AFatherThread, �@����worker���槹
			worker.join();
			
		} catch (InterruptedException e) {
			System.out.println("�����M�w���Ѥ��~�������F!");
		}
		System.out.println("�����}�l�~��!");
		System.out.println("�����~�����F!");
	}
}
//�˴��u�H
class WorkerThread implements Runnable {
	public void run() {
		System.out.println();
		System.out.println("�˴��u�H�e�˴���... ");
		//�����e�f...
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.print(i + " ����, ");
			}
		} catch (InterruptedException ie) {
			System.err.println("�˴��u�H�e�˴��~���o�ͷN�~!");
		}
		System.out.println();
		System.out.println("�˴��u�H�N�˴��e��a�F!");
		System.out.println("�˴��u�H�N�˴��w�˧���!");
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