package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet02 {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		set1.add("D");
		System.out.println(set1);//[A, B, C, D, F, Y]
		
		set1.clear();
		System.out.println(set1);//[]
		
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1);//[A, B, F]
		
		Set<String> set2=new HashSet<>();
		set2.add("B");
		set2.add("F");
		//set2.add("A");
		System.out.println(set2);//[A, B, F]
		
		System.out.println(set1.containsAll(set2));//true
		System.out.println(set1.equals(set2));//false
		
		set1.removeAll(set2);//set1'den set2'nin tum elemanlarini remove etmek
		System.out.println(set1.removeAll(set2));
		System.out.println(set1);//[A]
		System.out.println(set2);//[B, F]
		set1.add("B");
		
		set1.retainAll(set2);//set1'de calisir,set2'de olan elemanlari siler ve set2'de olmayan elemanalri siler
		                      //set2'de olmayan elemani set1den siler
		System.out.println(set1);
		System.out.println(set2);
		
		

	}

}
