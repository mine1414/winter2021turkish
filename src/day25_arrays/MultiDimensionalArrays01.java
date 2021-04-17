package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/*1-ic ice array olusturdugumuzda disardaki ana array'e outerb array
		 * icerdeki arraylere ise inner array denir
		 *2- eger icerdeki array'lerin boyutlari birbirinden farkli ise Array'i 
		 *ancak tum elemanlari yazarak declare edebiliriz
		 *3-Multi dimensional array'de bir elemanin indexi icin en disdaki array haric,
		 *elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */

		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}}; //iki katli bir arraydir
		
		//11'i index ile ifade etmek istersek arr[2][2]
		
		//eger arrayi uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][]=new int[3][2];
		//[3] ilk yazilan sayi outor arrayin icinde kac tane inner aray oldugunu belirtir
		//[2] her bir inner array'in uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		//multidimensional arrayleri yazdirmak icin toString methodu kullanilamaz
		//cunku toString methodu outer arrayi Stringe cevirir
		//outer arrayin icinde inner arrayler oldugundan tostring methodunda inner arraylerin 
		// teferans degerleri yazdirilir
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
