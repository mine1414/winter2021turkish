package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		// 
		
		String str="Javayla hayat ne guzel";
		System.out.println(str.endsWith("zel")); //true startwith de neyle basladigini gosterir
		
		System.out.println(str.endsWith("ne guzel")); //true
		
		System.out.println(str.endsWith("zel ")); // false stringlerde 1-1 esit olmali
		
		//kullanicidan bir email isteyin 
		//eger @ isareti icermiyorsa "girdiginiz bilgi email degil" desin
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin" desin
		//eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail" desin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email adrseinizi giriniz");
		String email=scan.next();
		
		if (!email.contains("@")) {  // basinda ! olunca email @ icermiyorsa olur
			System.out.println("girdiginiz bilgi email degil");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yazin");
		} else if(email.endsWith("@gmail.com")) {
			System.out.println("email'iniz basariyla kaydedildi");
		} else {
			System.out.println("gecersiz gmail adresi");
		}
		
     scan.close();
	}

}
