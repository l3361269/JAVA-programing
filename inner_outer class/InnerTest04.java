package project05;

public class InnerTest04 {

	public static void main(String[] args) {
		System.out.println(KK.R);//enum�Oprivate�ҥH����Q�إߪ���A���i�H������enum�̭��w�g�إߪ�����
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
