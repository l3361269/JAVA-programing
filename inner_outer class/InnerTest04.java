package project05;

public class InnerTest04 {

	public static void main(String[] args) {
		System.out.println(KK.R);//enum是private所以不能被建立物件，但可以直接用enum裡面已經建立的物件
		System.out.println(KK.G);

	}

}
enum KK{
	R{

		@Override
		public String toString() {
			return "OOO";
		}
		
	},G,B;
}
