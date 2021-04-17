package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin.
		//Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin,
		//gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		String gunIsmi=scan.nextLine(); //girilen tum yaziyi kucuk harfe cevirdik 
		                                              //lowercase veye upercase farketmez 
		if (gunIsmi.equalsIgnoreCase("pazar")||gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("paz");
		} else if (gunIsmi.equalsIgnoreCase("sali")) {
			System.out.println("sal");
		} else if (gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("car");
		} else if (gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		} else if (gunIsmi.equalsIgnoreCase("cuma")|| gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("cum");
		} else {
           System.out.println("Lutfen gecerli bir gun ismi giriniz");
		}

		
		
	

		

		

	scan.close();
		}
	}


