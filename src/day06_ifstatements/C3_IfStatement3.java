package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// Kullanicidan gun isminin ilk harfini isteyin ve 
		//harfe uygun olan gun isimlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun isminin ilk harfini giriniz");
		char ilkHarf=scan.next().charAt(0); //touppercase buyuk harf yapar
		//bu satir itibari ilen girilen stringin ilk karakterini almis olduk
		//p,s,c 
		
		if (ilkHarf=='p' || ilkHarf=='P') {
		System.out.println("pazar,pazartesi veya persembe");
	}
		if (ilkHarf=='s' || ilkHarf=='S') {
		System.out.println("sali");
	}	
		if (ilkHarf=='c' || ilkHarf=='C') {
		System.out.println("carsamba,cuma,cumartesi");
	}		
		if(ilkHarf!='p'&& ilkHarf!='P'&& ilkHarf!='s'&& ilkHarf!='S'&&
				ilkHarf!='c'&& ilkHarf!='C') {
			System.out.println("lutfen gecerli bir harf giriniz");
	}
		scan.close();
		
		

	}

}
