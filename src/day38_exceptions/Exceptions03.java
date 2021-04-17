package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
	//try catch blogundaki e'nin gorevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp=new Exceptions01();
		//esitligin solundaki exceptions01 hem class adi hemde exp objesi icin data turu
		
		try {
			System.out.println(sayi1/sayi2);
		}catch (ArithmeticException e) {
		//ArithmeticException java'da bir class ve e objesi icin data turu 
		//e ise ArithmeticException class'indan olusturdugumuz objenin adi
		//o zaman ismi e olmak zorunda degil ama genelde e kullanilir
			System.out.println("sayiyi sifira bolemezsin");//bizim kullaniciya vermek istedigimiz mesaj
			System.out.println(e);//java.lang.ArithmeticException: / by zero
		//bu durumda hem java'ya sorunu yazmasi icin firsat vermis
		//hemde application'u bloke etmemis olurum
			System.out.println(e.getMessage());/// by zero
			e.printStackTrace();//syso ya yazmamiza gerek yok print zaten
			                    //yazdirdigi: java.lang.ArithmeticException: / by zero
			//at day38_exceptions.Exceptions03.main(Exceptions03.java:15)
		}
		

	}

}
