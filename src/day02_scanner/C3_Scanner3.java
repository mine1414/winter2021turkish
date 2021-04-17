package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini alip aralarinda bir bosluk birakarak isim ve soysimi yazdirin
		//ISIM VE SOYISIM YAZDIRIN
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		String name=scan.next(); // sadece next() secilirse kullanici birden fazla kelime gelsede ilk kelimeyi alir
	                             // Tum yaziyi almasini istiyorsak nextline() secmemiz lazim
		                         //biri next biri nextline olmaz ayni olmali
	
		System.out.println("lutfen soyisminizi giriniz");
		//burada sabit bir yazi oldugu icin boyle yazmasini istiyorsak
		String surname=scan.next();
	    
	    System.out.println(name+" "+surname);
	    //burada cift tirnak olmamasi name ve surname veriable oldugu icin.burada islemi gerceklestiriyor
	    
	   System.out.println("lutfen mail giriniz");
	   String mail=scan.next();
	   
	   System.out.println("lutfen adresinizi giriniz");
	   String adres=scan.next();
	   
	   System.out.println(mail+ ""+ adres);
	   
	  
	   
	   scan.close();
	}

}
