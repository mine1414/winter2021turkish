package day45_linked;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll1=new LinkedList<>();
		//Colections'da esitligin sol tarafinda <> icinde data turu yazilmasa
		//veya data turu olarak Object yazilsa colecctions calisir
		//Ama boyle bir kullanimda surekli casting yapildigi icin
		//zaman ve hafiza acisindan verimli degildir
		
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<1000;i++) {
			ll1.add("A"+i);//concatination
			ll1.add(20+i);//toplama
			ll1.add('C'+i);//ascii degerleri
		}
		System.out.println(System.currentTimeMillis());
		//System.out.println(ll1);[A,20,C]
		
		LinkedList ll2=new LinkedList<>();
		ll2.add("B");
		ll2.add(25);
		ll2.add('K');
		System.out.println(ll2);
		
		LinkedList<String> ll3=new LinkedList<>();
		ll3.add("B");
		ll3.add(""+15);
		ll3.add(""+'K');
		System.out.println(ll3);

		
	}

}
