package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement05 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		// kenar uzunluklzri estise kare esit degilse dikdortgen yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir dortgenin iki kenar uzunlugunu girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("Dikdortgen");
		}
		
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("lutfen gecerli uzunluk giriniz");
		}
		//bug; yazilimdaki hatalara denir
       scan.close();
	}

}
