package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);
		
		//istenen indexdeki elemani kaldirip yerine bizim istedigimiz elemani koyar(replace)
		list.set(2, "Kemal");
		System.out.println(list);
		
		list.set(0, "Semih");
		System.out.println(list);
		
		//list.set(4, "Mustafa");//olmayan bir index kullanilirsa RTE verir
		
		list.add(2, "Yasin");//istedigimiz indexe ekler
		System.out.println(list);

		list.add(5, "Hurriyet");
		System.out.println(list);
		
		//list.add(10, "Sefer"); size den buyuk index kabul etmez
		
		System.out.println(list.contains("Hurriyet"));//true
		 System.out.println(list.contains("Cemal"));//false
		 list.contains("Mehmet");//bize boolean bir sonuc verir liste degismez
		 
		 //listin elemanlarini siralayaniz
		 Collections.sort(list);
		 System.out.println(list);
	}

}
