package day04_modulus;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		//modulus operatoru bolme isleminde kalani verir
		//15 tek mi cift mi 15/2 kalan=1
		//25 uce bolunur mu 25/3 kalan=1
		//herhangi bir sayinin  7 ile bolunebildigini kontrol etmek icin modulus islemi kullniriz
		// modulus isareti % dir
		
		int kalan=15%4;
		System.out.println(kalan);// 3
		System.out.println(26%8); //2
		
		//856 sayisinin birler basamagi kactir
		int sayi=856;
		int birlerBasamagi=sayi %10;
		System.out.println("sayinin birler basamagi:" +birlerBasamagi);

		System.out.println(856%10);
		
		//856 sayisinin 10 lar basamagi kactir
		//856 yi 85 yapmak gerekli.Birler basamagindan kurtulmak gerek
		// kurtulmak icin 10 a bolmek gerekli
		sayi/=10;  //85
		System.out.println("on'a boldukten sonra sayinin degeri:" + sayi);
		int onlarBasamagi=sayi%10;
		System.out.println("onlar basamagi:"+onlarBasamagi );
		
		//yuzler basamagini bulmak icin bir kere daha ayni islemi yapiyoruz
		
		
		
		
		
		

	}

}
 