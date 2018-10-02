package project05;

public class InnerTest03 {
	
	void scann(product p) {
		System.out.println(p.getName()+"/"+p.getPrice());
	}

	public static void main(String[] args) {
		new InnerTest03().scann(new product() {

			@Override
			public String getName() {
				return "USB";
			}

			@Override
			public int getPrice() {
				return 100;
			}
			
		}); 

	}

}
interface product{
	String getName();
	int getPrice();
}
