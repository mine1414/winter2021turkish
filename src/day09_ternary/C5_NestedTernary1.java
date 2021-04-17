package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		 // kullanicidan bir dikdortgenin uzunlugunu ve genisligini alin 
		 // girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		//System.out.println(kenar1==kenar2 ? "Kare" : "Kare degil");
		
		String sonuc=kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare degil"):"gecersiz kenar";
		System.out.println(sonuc);
		
		System.out.println( kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare degil"):"gecersiz kenar");
		
		scan.close();
	}

}
