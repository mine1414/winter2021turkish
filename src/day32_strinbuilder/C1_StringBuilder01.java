package day32_strinbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1);// Rumeysa

		// sb1.append(" Cetinturk");
		sb1.append(" ").append("Cetinturk");// append ile sb direk degisiyor yazdirirken ismi yeter
		System.out.println(sb1);// Rumeysa Cetinturk

		String cumle = "Javayi cok sever";
		sb1.append(cumle, 6, 10);
		System.out.println(sb1);// Rumeysa Cetinturk co

		System.out.println(sb1.length());// 21
		System.out.println(sb1.capacity());// 23

		System.out.println(sb1.charAt(1));// u bize bilgi getiren methodlar sb'yi degistirmez

		sb1.delete(17, 21);// Bu da degistirdi sb'yi
		System.out.println(sb1);// Rumeysa Cetinturk
		sb1.deleteCharAt(16);
		System.out.println(sb1);// Rumeysa Cetintur

		String isim = "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim));// FALSE Data turleri farkli oldugu icin icerigin kiyaslanmasi mumkun
												// degildir

		StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1 == sb2);// False
		System.out.println(sb1.equals(sb2));// False SB'sa equals methodu String'den farkli calisir
											// ancak ayni obje kiyaslandiginda true verir
		System.out.println(sb1.equals(sb1));// True

		System.out.println(sb1.indexOf("Cetin"));// 8
		System.out.println(sb1.indexOf("e", 6));// 9
		System.out.println(sb1.indexOf("Kazim"));// -1

		sb1.insert(7, " ");// istedigimiz indexten itibaren istedgimiz stringi ekler
		System.out.println(sb1);

		cumle = "Merhaba dunya";
		sb1.insert(0, cumle, 0, 8);// 0:SB'a hangi indexten itibaren ekleneck
		System.out.println(sb1); // cumle:Hangi string den ekeleneck
									// 0:cumlenin hangi indexinden baslanack
									// 8:bitis indexi
									// Merhaba Rumeysa Cetintur

		System.out.println(sb1.lastIndexOf("t"));// 22
		System.out.println(sb1.lastIndexOf("a", 22));// 14

		sb1.replace(8, 16, "Seher");// SB'nin baslangic ve bitis indexi'leri arasindaki kismi verilen String ile
									// degistirir
		System.out.println(sb1);// Merhaba Seher Cetintur
		
		sb1.reverse();
		System.out.println(sb1);//rutniteC reheS abahreM
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1);//Merhaba Seker Cetintur
		
		System.out.println(sb1.subSequence(8, 13));//seker sb'nin istedgimiz indexler arasindaki bolumu verir
		
		System.out.println(sb1.substring(8));//Seker Cetintur
		
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4)); //false
		//iceriklerinin esit olup olmadigina bakmak icin String deki equals methodunu kullanalim
		System.out.println(sb3.toString().equals(sb4.toString()));//true sadece iceriklere baktigindan
		
		sb3.toString().concat("insanin sevdikce sevesi geliyor");//string oldugu icin kalici degil syso ya yazmak gerek
		System.out.println();//tostring methodu kullaninca sb stringe donusmus olur
		                     //dolayisiyla tum string methodlari kullanilir
		System.out.println(sb1.length());//22
		System.out.println(sb1.capacity());//48
		sb1.trimToSize();//SB icin hazirlanan fazlaliklari siler length ile capaciteyi esit duruma getirir
		System.out.println(sb1.length());//22
		System.out.println(sb1.capacity());//22
		
		System.out.println(sb3.compareTo(sb4));
		
	}

}
