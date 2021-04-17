package day07_iflstatements;

import java.util.Scanner;

public class C2_Ifelse1 {

	public static void main(String[] args) {
		//Iki seceneklerde bu kullanilur
		// Kullanicidan dikdortgenin kenar uzunluklarini alin 
		//uzunluklar esit ise kare degilse kare degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dortgenin kenar uzunlugunu girin");
		double kenar1=scan.nextInt();
		double kenar2=scan.nextInt();
		
	    if(kenar1==kenar2) {
	    	System.out.println("Kare");
	    } else {
	    	System.out.println("Kare degil");
	    }
      
	    scan.close();
	}

}
