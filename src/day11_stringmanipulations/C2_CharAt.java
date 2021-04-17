package day11_stringmanipulations;

public class C2_CharAt {
	
	public static void main(String[] args) {
		// charAt(index)
		//scan.next().charAt(0) 0. indexdeki karakteri verir
		//index 0'dan baslar 
		
		String str="java cok guzel"; //uzunlugu 14 yani 1den sayilinca ama 0 ile baslanir bundan dolayi
		                            //  l3 oldugu icin buna kadar kabul eder
		                             
		System.out.println(str.charAt(0)); //Bize ilk harfi J yi verir
		
		System.out.println(str.charAt(5)); // 0dan saymaya baslanir c yi verir
		
		System.out.println(str.charAt(13));
		// Kelimenin uzunlugu son index + 1 dir
		//son index kelimenin uzunlugu(length) -1 
		//kullanici 10 harfli girerse son harfi verecek kodu yaziniz
		//str.charAt(9)
				
		
		//System.out.println(str.charAt(15)); //exeption verir hata
		//eger index olarak string in uzunlugu veya daha buyuk bir sayi girilirse hata verir 
		// mantiksal hata yok yani ilk etapta syntax dan bu hatayi vermez cunku kelime uzunlugunu bastan bilemez
		//ancak kod calistiktan (kod run) sonra islemi yaparken anlasilir.
		//bu tur hatalara Run Time Error RTE denir
		
		//String str3=5; // compile time error CTE
		               //kod calismadan java nin farkina varip altini kirmizi cizdigi hatalar
		               // derleme zaman hatasi
		
	}

}
