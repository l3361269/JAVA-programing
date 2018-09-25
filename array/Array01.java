package project05;

public class Array01 {
	
	public static void main(String[] args) {
		//[]內部必須為相同資料類型的元素
		//[]的宣告必須指定內部空間的數量,一旦指定后,不可修改
		//直接宣告:名稱+內容值+內容數量
		/*int[] a1 = {10,15,20,25,30};
		System.out.println(a1[1]);
		a1[1]=155;
		System.out.println(a1[1]);
		//System.out.println(a1[8]);
		
		//間接宣告:名稱+內容數量
		int[] a2 = new int[5];
		a2[0]=10;
		a2[1]=15;
		System.out.println(a2[3]);
		
		//
		int[] a3 = new int[]{10,15,20,25,30};
		*/
		///
		int[] b1= {1,2,3,4,5};
		System.out.println(b1[4]);
		//b1[5]=6; ERROR-->array數量指定後就不可以再修改
		//System.out.println(b1[5]);
		
		int[] b2=new int[5];
		System.out.println(b2);//這樣是印出array的記憶體位置
		System.out.println(b2[3]);
		
		int[] b3=new int[] {1,2,3,4,5};
		System.out.println(b3);
		
		
	
	
	}
	

}
