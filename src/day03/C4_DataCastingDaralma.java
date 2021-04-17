package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		//double bir degisken olusturalim ve bunu int ve sonra da byte cevirin
		
		double numDouble=131.56;
		int numInt=(int)numDouble;
		// Double den integere gecerken eger sayida ondalikli bolum varsa java ondaliklil kismi siler
        System.out.println("integer degisken degeri:" + numInt);
        
        byte numByte=(byte)numInt;
        //daha dar bir data tipine cevirirken eger sayi data tipinin sinirindan buyukse saymaya 
        //negatif en kucuk sayidan devam eder istenen sayiya gelinceye kadar//
        //tekrar tekrar en kucuk sayiya gider
        System.out.println("byte degisken degeri:" + numByte);
	}

}
