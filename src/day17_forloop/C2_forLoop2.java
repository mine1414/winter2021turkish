package day17_forloop;

import java.util.Scanner;

public class C2_forLoop2 {


	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		System.out.println("Lutfen sinir degeri icin pozitif bir tamsayi giriniz");
		int sinir=scan.nextInt();
		
	if(sayi<=0) {
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
	} else {
		if(rakamlarToplamiHesapla(sayi)>sinir) {
			System.out.println("Girdiginiz sayinin rakamlar toplami,girdiginiz sinir degerinden buyuktur");
		}else {
			System.out.println("Girdiginiz sayinin rakamlar toplami,girdiginiz sinir degerinden kucuktur");
		}
		
		scan.close();
	}
	
			
		

	}

	public static int rakamlarToplamiHesapla(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+""; 
		for (int i = 0; i<=sayi2.length()-1 ; i++) {
			rakamlarToplami+=sayi%10;
			sayi/=10;
			}
		
		return rakamlarToplami;
	}


	

}
