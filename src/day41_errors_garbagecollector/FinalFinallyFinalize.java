package day41_errors_garbagecollector;

public class FinalFinallyFinalize {
	
	final static  int SAYI2=20;
	//insatnce bir veriable'i final ve static yaparsaniz java onu bold yapar
	//bizde ismi buyuk harfle yazariz
	
	//final String soyisim;
	//final veriable'larin degeri sonradan degistirilemeyecegi icin 
	//ilk atama yapilmadan olusturumlmasina java izin vermez

	public static void main(String[] args) {
		
		System.out.println(SAYI2);
		
		final int sayi=10;
	//	sayi+=2; final olarak tanimlanan veriable'a yeni deger atamanaz 
		
		System.out.println(Integer.MAX_VALUE);
		}
	
	public void deneme() {
		System.out.println("parent calss'taki override method");
	}
	
	public final void deneme2() {
		System.out.println("deneme yapiyoruz");
		
	}

}
