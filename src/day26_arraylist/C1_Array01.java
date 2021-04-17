package day26_arraylist;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		/*Verilen bir array den isten degere esit olan elemanlari kaldirip
		 * kalanlari yeni bir array olarak yazdiran bir method yaziniz
		 * 
		 */

		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=3;
		
		//1.adim olarak arr icinde kaldirmam istenen sayi kac tane var,bulmam gerekiyor
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sayi)
				count++;
			}
		//2.adim yeni array olusturalim
		int arr2[]=new int [arr.length-count];
		
		//3.adim arr arrayinden elemanlari tek tek alip istenen sayiya esit degilse 
		//arr2'ye ekleyecegim 
		int temp=0; // bununla yeni arrayin indexlerini kontrol edecegiz
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=sayi) {
				arr2 [temp]=arr[i];
				temp++;
				
				}
			}
		System.out.println(Arrays.toString(arr2));
	}

}
