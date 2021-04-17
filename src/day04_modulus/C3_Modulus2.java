package day04_modulus;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		//kullanicidan dort basamakli bir sayi alalim ve 
		//sayinin basamaklarini ters sirada yazdiralim
		
		//bir sayinin basamaklarini elde etmek icin iki islemi tekrar tekrar yapariz
		//1.islem en sondaki basamagi elde etmek
		//2.islem en sondaki basamagi yok etmek
		//basamak sayisi kadar tekrar ederiz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("basamaklarini bulmak icin dort basamakli bir sayi giriniz");
		int sayi=scan.nextInt();// bu satirdan itibaren elimizdz dort basamakli sayi var
		
		//4 basamagi elde etmek icin yukarida yazdigimiz islemi uc kere yapiyoruz
		//1.tekrar
		int birlerBas=sayi%10;// birler basamagini elde ettik
		sayi/=10; //sayimiz uc basamakli oldu
		
		//onlar basamagi bulmak icin 2.tekrar
		int onlarBas=sayi%10;// onlar basamagini elde ettik
		sayi/=10; //sayimiz iki basamakli oldu
		
		//3.tekrar yuzler basamagi icin
		int yuzlerBas=sayi%10;
		sayi/=10; // sayimiz bir basamakli oldu
		
		int binlerBas=sayi%10; //burada % islemi yapmak zorunda degiliz
		
		//tum basamaklar var ve yazdiralim
		System.out.println("Birler basamagi:"+birlerBas);
		System.out.println("Onlar basamagi:"+ onlarBas);
		System.out.println("Yuzler basamagi:"+ yuzlerBas);
		System.out.println("Binler basamagi:"+ binlerBas);
		
		//sayiyi tersten yazdiralim
		
	    System.out.print(birlerBas);
	    System.out.print(onlarBas);
	    System.out.print(yuzlerBas);
        System.out.println(binlerBas);
    
        System.out.print(binlerBas);
        System.out.print(yuzlerBas);
        System.out.print(onlarBas);
        System.out.println(birlerBas);
    
    //sayinin rakamlari toplami bulalim
    System.out.println(birlerBas+onlarBas+yuzlerBas+ binlerBas);
    
    //rakamlari toplamini degil sayilari yan yana yazdirmak istersek 
    System.out.println("yazdiginiz sayinin tersten yazilisi:" +birlerBas+onlarBas+yuzlerBas+ binlerBas);
	
	scan.close();	
		
		
	}
}

