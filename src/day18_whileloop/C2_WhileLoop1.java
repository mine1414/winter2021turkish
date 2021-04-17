package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// while:iken,oldugu surece
		//ne kadar kere yazdircagimz belli ise for loop
		// yazilan rakam kac kere yazildi denirse while sart saglanana kadar devam eder
		//10 dan 30 a kadar olan sayilardan 4 ile bolunebilenleri 
		//aralarinda bir boslukolacak sekilde yazdirin
		
		//once for loop ile yapalim
		for (int i = 10; i <=30; i++) {
			if(i%4==0);
			System.out.print(i+ " ");
		}
        System.out.println(" ");
        
        // aynisin while loop ile yapalim
        int sayi=10; // 1.sarti gerceklestirdim baslangic degeri
        while (sayi<=30) { // 2.kosul 
        	if(sayi%4==0);
			System.out.print(sayi+ " ");
        }
        sayi++; // 3:sarti gerceklestirdim degisim degeri
	}

}
