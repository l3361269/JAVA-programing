package project06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class Set01 {
	public static void main(String[] args) {
		//Set不能放入相同的物件(會依據其值來判斷是否相同)
		//Set中的元素不依加入的順序來放置(元素沒有index)
		//而是以其記憶體位置來放置
		//元素若為JAVA原生API者(ex.String、char、基本資料型態等)，則會直接看其值來判對是否相同
		HashSet hs = new HashSet();
		hs.add("JAVA");
		hs.add(12.8);
		hs.add('b');
		hs.add("JAVA");
		hs.add(12.8);
		hs.add('b');
		hs.add(new car());
		hs.add(new car());
		System.out.println(hs);
		//---
		//走訪
		/*1.for寫法I
		for(int i =0;i<hs.size();i++) { //set沒有順序，所以不能以順序(或index)來寫
			System.out.println();
		}*/
		/*2.for寫法II
		for(Object o:hs) { //以set內容物來寫是可以的
			if(o<=30) {} //但是若set沒有過濾過，則很難有比對方法
		}*/
		//3.iterator
		Iterator it=hs.iterator();//=右邊先執行:建立hs的副本(iterator)，放到=左邊的Iterator容器中 名稱叫it
		while(it.hasNext()) {//boolean hasNext():如果還有下一個元素就return true，也就是說當next()回傳出東西(而不是exception)的話，就會return true
			//hs.add(222);//不能在操作副本時 操作原容器(因為副本會對應不了原容器)
			System.out.println(it.next());
			it.remove();//操作副本時會同步操作到原容器
		}
		System.out.println(hs);//
		
	}

}
class car{
  //自己類中的override:改掉預設
  //類中的方法是等待被呼叫 才會用到的
	@Override
	public String toString() { //顯示這個物件的名稱(原本預設是記憶體位址)
		// TODO Auto-generated method stub
		return "car";
	}

	@Override
	public boolean equals(Object arg0) { //比對物件是否與已存在的物件的記憶體位址相同
		// TODO Auto-generated method stub
		return true;//改成不管結果如何都return true(回答記憶體位置一樣)
	}

	@Override
	public int hashCode() { //回傳此物件的hashcode
		// TODO Auto-generated method stub
		//return super.hashCode(); //default
		return 100; //不管實際維和，都回傳100
	}
	
	//set在加入element時，會呼叫equals、hashcode，來double check物件的記憶體位置是否相同
	//儘管我們此處都用override改掉預設，騙過set了
	//不代表只產生出一個car而已，實際上是宣告幾次就建立了幾個car
	
	
}
