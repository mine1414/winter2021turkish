package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanicidan gun ismini isteyin
		//girilen gunun hafta ici veye h sonu oldugunu yazdirin
		//pazar-- haftasonu  sali--haftaici
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir gun ismi yaziniz");
		String gunIsmi=scan.nextLine().toLowerCase(); // tolowercse kucuk harfe cevirir  touppercase buyuk harfe cevirir 
		                                              // karsilastirmayi yazarkende buna gore yazmaliyiz(if li kisim)
		if (gunIsmi.equals("cumaretsi") || gunIsmi.equals("pazar")) { //stringde esitlik sorguluyorsak iki = kullanmamaliyiz:
			                                            //equal metodunu kullanmaliyiz()
			System.out.println("Haftasonu");
		}
		
	   if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")) {
		   System.out.println("haftaici");
	   }
	   //bu kodda  gun ismi yanlis yazilmissa olusacak durum yok
      scan.close();
	}

}
