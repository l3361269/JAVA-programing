package project06;
import java.util.*;
public class LinkHashSet01 {

	public static void main(String[] args) {
		test(new HashSet());//沒有依順序
		test(new LinkedHashSet());//依順序 
	}

	public static void test(Set set) { //參數是Set(是父類(所以其底下子類都可以))的物件(HashSet,LinkedHashSet是其子類)
		System.out.println("\n" + set.getClass().getName());
		for (int i = 100; i <= 110; i++) {
			set.add(i);//100,101...110
		}
		set.add(108);//X
		set.add(101);//X
		set.add(118);//OK
		
		for (Iterator it = set.iterator();it.hasNext();) {//一樣是for(;;)的結構，只是因為有iterator迭代了所以最後一項不用寫
			System.out.print(it.next() + "\t"); //因為先判斷hasNext()，所以指標是在第一個元素的最前面，所以.next是回傳指標的下一個也就是第一個element
		}
		
	}
}