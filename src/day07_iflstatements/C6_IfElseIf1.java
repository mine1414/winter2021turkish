package day07_iflstatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. 
		//Not�u harf sistemine cevirip yazdirin. 
		//50�den kucukse �D�, 50-60 arasi �C�, 60-80 arasi �B�, 80�nin uzerinde ise �A�
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen notunuzu sayi olarak giriniz");
		double not=scan.nextDouble();
		
		if (not<0 || not>100) { //istenmeyen durum
			System.out.println("Lutfen gecerli bir not giriniz");
		} else {   if (not<50) {
			System.out.println("Notunuz: D");
		} else {   if (not<60) {   //notum zaten 50 ile 100 arasindadir
			System.out.println("Notunuz: C");
		} else {  if (not<80) {    // notum 60 ile 100 arasindadir
			System.out.println("Notunuz: B");
		} else {                   //notum 80 ile 100 arasinda
            System.out.println("Ntunuz: A");
		} 
 scan.close();
		}

		}          //notumuz 0 ile 100 arasinda
			                  //geriye tek bir durum kalmadigi icin yeniden if 
            
		}
		
		
		

	}

}
