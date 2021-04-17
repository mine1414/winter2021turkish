package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		// bir Arraylist nasil olusturulur
		//ArrayList bir objedir dolayisiyla yeni bir tane olusturmak icin new keyword kullanmaliyiz
		
		//1.yol
		ArrayList<String> list=new ArrayList<String>();
		
       //2.yol
		ArrayList<String> list2=new ArrayList<>();
		
		//3.yol sol declaration sag taraf deger constractor
		List<String> list3=new ArrayList<>();
		
		//NOT:eger constructor olarak list<>()kullanilirsa CTE verir
		//list<>() constructor olarak kullanilamaz
		
		//list<String>list4=new list<>();
		//olusturdugumuz class isimleri java da kullanilan obje isimleri ile ayni olmamalidir
		
		//liste eleman ekleme 
		//list olustururken otomatik olarak eleman ekleme ozelligi yoktur
		//elemanlarin tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		//list nasil yazdirilir
		System.out.println(list3); //[Ali,Veli,Ayse]
		
		list3.add(1, "Can");//1. indexe isetnen degeri ekler
		System.out.println(list3); //[Ali, Can, Veli, Ayse]
		
		list3.add(1, "Fatma");
		System.out.println(list3); //[Ali, Fatma, Can, Veli, Ayse]
		System.out.println(list3.toString());
		
		/*Verilen bir array den isten degere esit olan elemanlari kaldirip
		 * kalanlari yeni bir arraylist olarak yazdiran bir method yaziniz
		 * 
		 */
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=3;
		
		List<Integer> istenenList=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
			
		}
		System.out.println(istenenList);
	}

}
