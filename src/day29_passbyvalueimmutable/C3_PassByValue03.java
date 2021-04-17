package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
	/*	Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
	 * Iki method olusturup list elemanlarini artirmayi deneyelim
	  - 1. Method’da elemanlari for each loop kullanarak artirin
     - 2. Method’da elemanlari set method’u kullanarak artirin
      - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim
		  */
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);//[10, 11, 12]
		
		degistirFor(list);
		System.out.println("1.method call'dan sonra:" + list);//[10, 11, 12]
		
		degistirSet(list);	
		System.out.println("Set ile degistirdigimiz liste  : " + list);
		//java passbyvalue kullanir ancak list'deki set methodu ististani olarak 
		//methodun icinde yapilan degisiklikleride kalici hale getirir
	}

	public static void degistirSet(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			list.set(i, list.get(i)+1);
		
		}
		System.out.println("Set ile degistirdigimiz liste methodun icinde : " + list);
		
		}

	public static void degistirFor(List<Integer> list) {
		
		for (Integer each:list) { // foreach loop ile listeyi guncellemiyoruz
			each+=1;              //sadece herbir elemani tek tek cagirip 1 fazlasini yazdirdik 
			System.out.print(each + " ");
		}
		System.out.println("");
		System.out.println("degistirfor methodundaki liste:" + list);// listenin kendisinin degismedigini gorduk
		
	}

}
