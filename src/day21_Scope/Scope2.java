package day21_Scope;

public class Scope2 {

	public static void main(String[] args) {

       // Static veriableler icin object olusturma ihtiyaci yoktur
		//baska bir calsstan static veriablelere ulasmak istedigimizde 
		//ulasmak istedigimiz classin adi . static veriable adi yazmak yeterlidir
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId); // Java Run Time programdir
		                                  // scope2 calistirildiginda tekrar scope1 calismazzzzz
		                                   // dolayisiyla en basta atanan degreler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi); //Mehmet Koleji
		
		Scope1.staticMethod(); //scope 1 deki sadece bu method calisir 19.satir ama buradiki degrelere gore calisir
		                       // orada deger degisirse dger o sekilde degisir
		System.out.println(Scope1.okulId); // scope 1 deki method calistiginda bunun degerini farkli atadigi icin degeri degisti
		System.out.println(Scope1.okulAdi);
		

	}

}
