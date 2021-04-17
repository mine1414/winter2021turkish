package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05_ArrayListYap {

	public static void main(String[] args) {
		
		String arr[]= {"Ali","Veli"};
		List<String> listArr=Arrays.asList(arr);
		System.out.println(listArr);//[Ali, Veli]
		
		Integer arr1[]= {1,2,3};
		List<Integer> list2=Arrays.asList(arr1);
		System.out.println(list2);//[1, 2, 3]
		
		//bazen cok fazla elemani olan bir liste olusturmamiz gerekir
		//bu durumda liste elemanlarini tek tek eklemek yerine elemanlari
		//bir ARRAY'e ekler,sonra da array'i liste cevirebiliriz
		//ornek bir web sitesindeki tum urunleri bir listeye eklemek istedigimizde
		
		//ancak bu method'la arrayden cevirdigimiz list esnek olmaz
		//add(),remove(),clear gibi uzunlugu etkileyen methodlar kullanilamaz
		//Java bu degisimdeki Array ve List'i sekronize eder,birinde yaptigimiz 
		//degisiklik otomatik olarak digerini de update eder
		
		arr1[1]=5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2: " + list2);
		
		list2.set(0, 13);
		System.out.println("list2: " + list2);
		System.out.println("array: "+ Arrays.toString(arr1));
		
		
		
	}

}
