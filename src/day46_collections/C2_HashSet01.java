package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		/*
		 Verilen bir array'deki tekrarli elemanlari silip 
		 unique elemanlardan olusan bir array'e ceviren bir method yaziniz
		 */
		
		int arr[]= {2,3,5,4,3,6,7,4,8,5,4};
		
		int tekrarsizArray[]=tekrarlariSil(arr);
		System.out.println("Main method icinde array olarak:"+Arrays.toString(tekrarsizArray));
	}

	public static int[] tekrarlariSil(int[] arr) {
		
		Set<Integer> set1=new HashSet<>();
		for(Integer each:arr) {
			set1.add(each); 
		}
		System.out.println("Set olarak method icinde list :"+set1);//[2, 3, 4, 5, 6, 7, 8]
		
		int tekrarsizArray[]= new int[set1.size()];//yukaridaki ile ayni degil scope'leri farkli ama islev ayni oldugu icin kod okunurlugu rht
		
		int index=0;
		for(int each:set1) {
			tekrarsizArray[index]=each;
			index++;
		}
		return tekrarsizArray;
	}

}
