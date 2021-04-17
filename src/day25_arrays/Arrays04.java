package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// iki array'in esit oldugunu kontrol edin
		
		int arr1[]= {10,25,5,20};
        int arr2[]= {25,10,20,5};
        System.out.println(Arrays.equals(arr1, arr2));
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
        
        //iki arrayin birbirne esit olmasi icin hem uzunluklari, icindeki tum elemanlar,
        //ve esit elemanlarin indexleri esit olmalidir 
	}

}
