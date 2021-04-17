package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		//Listin uzunlugu nasil bulunur
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list); // [10, 15, 8, 12, 20]
		
		System.out.println(list.size());// 5
		
		//bir eleman nasil silinir
		list.remove(1);
		System.out.println(list); //[10, 8, 12, 20]
		
		System.out.println(list.remove(2));//git 12 yi kaldir dedik bize 12 yi dondurur
		System.out.println(list);//[10, 8, 20]
		
		//remove(index) kullandigimizda remove eder ve delil olarak o elemani getiriri
		//eger olmayan bir index girersek RTE verir
		//System.out.println(list.remove(5)); //git 5.indexi kaldir ama 5 yok RTE verir
		
		List<String> list2=new ArrayList<>();
		list2.add("Ali");
		list2.add("Veli");
		System.out.println(list2.remove("Hasan"));//git hasani kaldir bulamadigi icin false dondurur
		System.out.println(list2);
		
       // remove(object) methodu kullanildiginda eger java istenen elemani bulup remove ederse 
		//bize remove edilen elemani dondurur,listede bulamazsa 
		//istedgin yerine getirelemedigini anlamaniz icin false dondurur
		
		System.out.println(list2.remove("Veli"));
		System.out.println(list2);
		
		
		

	}

}
 