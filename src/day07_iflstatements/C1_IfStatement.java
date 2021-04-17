package day07_iflstatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullanicidan bir tam sayi isteyin
		//sayi pozitif ise "sayi pozitif" yazin
		//sayi 100'den kucukse "kucuk sayi" yazdirin
		//sayi 1000'den buyukse "buyuk sayi" yazdirin;birbirine bagli degiller
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayi pozitif");
		}
        if (sayi<100) {
        	System.out.println("Kucuk sayi");
        }
	    if (sayi>1000) {
			System.out.println("Buyuk sayi");
		}
	    
	scan.close();
	
	
	}

}
