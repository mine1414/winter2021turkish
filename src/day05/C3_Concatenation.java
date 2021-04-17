package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation: (birlestirme):java da birden fazla Stringi + isareti ile 
		//toplarsaniz, java bu stringleri yan yana yazar
		
		String str1="Java";
		String str2="Guzeldir";
		System.out.println(str1+str2); //JavaGuzeldir
		
        //eger arada bosluk birakmak istersek
		System.out.println(str1+" "+str2);
		System.out.println(str1+' '+str2); 
		
		//GuzeldirJava
		System.out.println(str2+str1);// isin icinde string I varsa java concatenation yapar, yanyana yazar
		
		int sayi1=5;
		int sayi2=4;
		//verilen degiskenleri kullanarak konsolda 9 yazdirin
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+str1+str2); //9JavaGuzeldir
		System.out.println(str1+str2+sayi1+sayi2); //JavaGuzeldir54
		
		//verilen degiskenlerle JavaGuzeldir1 yazdirin
		System.out.println(str1+str2+(sayi1-sayi2)); //java ilk parentezi cozer sonra concatenation
		
		//verilen degerlerle 9 JavaGuzeldir yazdirin
		System.out.println(sayi1+sayi2+" "+str1+str2);//9 JavaGuzeldir
		System.out.println(sayi1+sayi2+' '+str1+str2);//41JavaGuzeldir
		//Java matematiksel bir islem yaparken char data turunden bir degerle karsilirsa o charin ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2); //9Java Guzeldir
		System.out.println(str1+str2+sayi1*sayi2); //Oncelik carpma oldugu icin onu yapar JavaGuzeldir20
		
		//son tekrar 
		//* kural1 eger toplanan degerlerden bir tanesi bile string ise Java toplama degil concatenation 
		//* Kural2 Eger toplanan degerlerin ikisi de matematiksel islemse java toplar
		//* kural3 Eger sayi ve string degiskenler birlikte kullanilacaksa oncelikler belirlenip o islemler icin parantez kullanilabilir
		//* kural4) Matematiksel bir islemde char degisken kullanilirsa, Java char'in ascii degerini
       // *          isleme alir
        //* kural5) char bir degisken ile String bir degisken toplanirsa concatenation olur

		
	}

}
