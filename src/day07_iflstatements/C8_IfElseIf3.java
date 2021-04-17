package day07_iflstatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
		//Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 60 – 80.000 arasinda ise  “Konusabiliriz”, 
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen maas teklifinizi giriniz");
		double maas=scan.nextDouble();
		
		if (maas>80000) {
			System.out.println("Kabul Ediyorum");
		} else {  if (maas<60000) {
			System.out.println("Maalesef Kabul Edemem");
		} else {
           System.out.println("Konusabiliriz");
		}

	
		
		scan.close();
		}
		
		

	}

}
