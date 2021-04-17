package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		// kullanicidan isim ve soyisim isteyip 
		//Isim:mehmet
		//soyisim:bulutluoz
		//kursumuza kaydiniz alinmistir,tesekkur ederiz
		//seklinde yazdirin
		
		// Scanner kullanicidan bilgi almak icin kullanilir
		// 3 Adimda islemi tamamliyoruz
		
		//1.adim Scanner objesi olusturuyoruz
		// Ssanner in calismasi icin Java util kutuphanesinden ilgili
		//kismi classimiza import etmeliyiz
		Scanner scan=new Scanner(System.in); // sol veriable sag deger =assigment atama
		
		//2.adim kullaniciya ne istedigimizi belirten mesaj yazmaliyiz
		System.out.println("lutfen isminizi giriniz");
		//3.adimda bir veriable olusturup kullanicinin girdigi degeri atayacagiz
		String name=scan.nextLine();// scan nokta yapinca seceneklerden data tipine gore secelim
		
		System.out.println("lutfen soy isminizi girin");
		String surname=scan.nextLine(); //next tek kelime alir line olursa birden fazla kabul eder
		
		//bizden istenen sekilde yazdiralim
		//eger yazdiracagimiz yazi sabit ise " " arasinda yazdirilir
		//eger veriable a atanmis degeri yazdirmak istiyorsak
		//"" olmdan sadece veriable ismini yaziyoruz
		
		System.out.println("isminiz"+ " "+ name);
		System.out.println("soyisminiz"+ " "+surname);
		System.out.println("Kursumuza kaydiniz alinmistir,tesekkur ederiz");

       scan.close();
	}

}
