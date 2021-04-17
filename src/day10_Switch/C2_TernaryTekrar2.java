package day10_Switch;

import java.util.Scanner;

public class C2_TernaryTekrar2 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		//sayi cift ise cift yazdirin
		//degil ise karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		//eger ternary de iki durum icin farkli data tipleri donusu oluyorsa
		//ya veriable atama yapmadan direk yazdiririz
		//ya da mumkunse sonuclari ayni data tipine cevirmeye calisiriz
				
		//String sonuc=sayi%2==0 ? "cift" : sayi*sayi+"";
		//System.out.println(sonuc);
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);
		
		scan.close();

	}

}
