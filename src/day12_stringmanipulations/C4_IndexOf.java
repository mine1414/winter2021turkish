package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// indexof() methodu istedigimiz karakter(lerin) indexini dondurur 
		
		String str="Java ogren, is sahibi ol";
		System.out.println(str.charAt(6)); //g 
		System.out.println("char arama: " + str.indexOf('g')); //6
		System.out.println("String arama: " + str.indexOf("g")); //6
		System.out.println("String kelime arama: " + str.indexOf("is")); // i-->12 s-->13 NETICE 12
		System.out.println("birden fazla varsa: " +str.indexOf('i')); // Ilk buldugu indexi getirir
		
		
		System.out.println("baslangic indexi ile: " +str.indexOf('a', 4));//baslangic indexi inclusive 
		                                                                  //  4 den sonraki a ya bakar
		System.out.println("Olmayan harf: " +str.indexOf("ali"));
		
		//kullanicidan bir cumle isteyin
		// case sensitive olmadan java kelimesi icerip icermedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		//int sonuc=cumle.indexOf("java"); // Java varsa,ilk java kelimesinin indexini dondurur
		                                 // Java yoksa ,-1
		//System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		if (cumle.indexOf("java")>=0) {//java kelimesinin indexinin 0 veya daha buyuk old kont eder
			System.out.println("Cumle java iceriyor");
		}else {
			System.out.println("Cumle java icermiyor");
		}
		
		System.out.println(str.lastIndexOf('a')); //en sondaki a yi bulur
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.lastIndexOf("ali"));
		System.out.println(str.lastIndexOf('a',18));
		System.out.println(str.lastIndexOf("ali"));
		System.out.println(str.lastIndexOf("ogren"));
		
		scan.close();
		
		
		
	}

}
