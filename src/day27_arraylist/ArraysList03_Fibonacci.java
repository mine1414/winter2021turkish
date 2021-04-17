package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysList03_Fibonacci {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir tamsayi alin
		//aldigimiz sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		//1 1 2 3 5 8 13 21 34....
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList();
		fibo.add(1);
		fibo.add(1);
		System.out.println(fibo);//[1, 1]
		
		System.out.println(fibo.get(0)+fibo.get(1)); //toplama yaptik
		
		
		/*for (int i = 2; fibo.get(i-2)+fibo.get(i-1)<sayi; i++) {// Karsilastirma toplam ile sayinin kendisi ile
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			}
		System.out.println(fibo);
		*/
		int i=2;
		int yeniSayi=0;
		while(yeniSayi<sayi) {
			yeniSayi=fibo.get(i-2)+fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
		}
		System.out.println(fibo);
	}

}
