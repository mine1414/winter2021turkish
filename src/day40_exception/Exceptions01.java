package day40_exception;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		//Kullanicidan yasini girmesini isteyin. 
		//Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
	   //Java'ya bir exception throw ettirmek icin "throw" ve "new" keywordleri kullanilir
		
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(yas>=0) {
			System.out.println("Girdiginiz yas:"+yas);
		}else {
			throw new IllegalArgumentException();
		}
		System.out.println("Kod bloke olmamis");
		
        //Bu sekilde yazdigimizda java exception throw eder ama
		//kodumuzu da bloke olmus olur
		//bloke olmasini engellemek icin kodu try catch ile surround yapabiliriz
		
		 
		
	
	}

}
