package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve armaka istedigi bir string girin
		//cumle string iceriyorsa basarili degilse basarisiz yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen aramami istediginiz Stringi giriniz");
		String aranan=scan.nextLine().toLowerCase();
		
		String str=cumle.contains(aranan) ? "Basarili" : "Basarisiz";
		System.out.println(str);
		
		//kullanicidan mail daresini isteyin 
		//mail adresi @gmail.com iceriyorsa mailiniz kaydedildi 
		//yoksa lutfen gmail adresinizi giriniz yazdirin
		
		System.out.println("Lutfen mail adresinizi giriniz");
		String mail=scan.next();
		
		System.out.println(mail.contains("@gmail.com") ? "mailiniz kaydedildi" :"Lutfen gmail adresinizi giriniz");
		
		
scan.close();
	}

}
