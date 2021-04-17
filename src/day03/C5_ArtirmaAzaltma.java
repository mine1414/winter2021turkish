package day03;

public class C5_ArtirmaAzaltma {

	public static void main(String[] args) {
		
		int num=15;
		//bir sayiyi iki artirmak istersek toplariz
		int num2=num+2;
		System.out.println("num2=" + num2);
		System.out.println("num=" + num);
		
		num=num+5;
		//Burada basina int yazmiyoruz zaten bastan numun int oldugunu tanimladik
		//num degeri degismis oldu deger 20 olur.
		//esitligin solunda num yazdigimizda esitligin saginda olusan 
		//sonuc veriable ye atanir.(ATAMA)
		//bu satirdan sonra num degisir 
		
		System.out.println("16.satirdan sonra num= " + num);
		System.out.println(num+12); // SONUC 32
		
		//bir sayiyi artirmak(increment) istersek o sayiya istedigimiz sayiyiyi ekler
		//veriable ye atariz
		
		num=num+8; // num 28
		num+=5;    // num 33
		System.out.println("pratik arttirma sonras num=" + num);
		
	   num+=10; // num=43
	   
	   //num 1 arttir
	   num+=1; // num=44
	   //sadce 1 arrtirmaya ozel java pratik method
	   num++;
	   System.out.println("num son hal:" + num);
		
		
		

	}

}
