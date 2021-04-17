package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin.
		* Bu sayinin negatif veya pozitif oldugunu,
		*tek mi cift mi oldugunu ve
		* uc basamakli veya  buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 *100’den kucukse sadece 1’ler basamagini yazdirin.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		pozitifNegatif(sayi);
		tekMiCiftMi(sayi);
		
		
		
		 if (sayi>=100) {
	            
	            yuzdenBuyuk(sayi);
	            
	        } else {
	            yuzdenKucuk(sayi);
	        }

scan.close();
	}

	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
		
	}

	public static void yuzdenBuyuk(int sayi) {
		int yuzler=sayi/100,onlar=sayi/10%10,birler=sayi%10;
		System.out.println(yuzler+onlar+birler);

		
	}

	public static void tekMiCiftMi(int sayi) {
		if (sayi%2==0) {
			System.out.println("cift sayi");
		}else {
			System.out.println("tek sayi");
		}
		
	}

	public static void pozitifNegatif(int sayi) {
		System.out.println(sayi>=0 ? "pozitif" :(sayi<0 ? "negatif" : "sayi pozitif ve nefatif degildir"));
		
	}

}
