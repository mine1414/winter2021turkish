package day20_scope;

import java.util.Scanner;

public class Scope1 {
     // scope kapsam demektir
	// classin icinde fakat main methodun disinda olusturulan ve static olmayan
	// veriable'lara INSTANCE (Object) veriable denir
	// class levelde olusturuldugu icin classin heryerinden belli sartlarla
	// kullanilabilir
	// instance veriable'ler object'e bagli olarak calisir(ogretmen ve ogrenci adi notu gibi kisiyi baglar)
	
	public int sayi; // default deger 0
	public String isim = "Mehmet";
	public String soyisim; // default deger null
	boolean izindeMi; // default deger false
	char ilkHarf; // default deger space

	public static void main(String[] args) {

		// staticMethod();
		// method(); // calismaz static olamayan methodu static methoda cagiramazsin
		// System.out.println(sayi); //static olmayan bir veriable'a static method
		// icinden ulasamayiz
		// main methodumuz static oldugu icin main method icerisinden static olmayan
		// veirable
		// veya method lara direk ulasamayiz

		// instance veriable'a main method icerisinden ulasmak istedigimizde OBJECT
		// olusturmaliyiz

		Scanner scan = new Scanner(System.in);// bu javadaki standart obje olusturma formu
		// class ismi obje ismiobje olusturma keyword classismi()

		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi); // buna deger atamadik java default deger olarak 0 verdi
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim); // buna deger atamadik java default deger olarak null verdi

		// instance veriable'lar olusturuldugunda biz istersek deger atayabiliriz
		// instance veriable'lara eger biz deger atamazsak Java Deafult deger atar

		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyisim = "Baba";
		System.out.println(obj2.isim + " " + obj2.soyisim);// Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyisim); // Mehmet null
		System.out.println(obj2.izindeMi); // false boolean icin default deger false dir
		System.out.println(obj2.ilkHarf);

		Scope1 obj3 = new Scope1();
		obj3.isim = "Ferdi";
		obj3.soyisim = "Tayfur";
		obj3.izindeMi = true;
		System.out.println(obj3.isim + " " + obj3.soyisim + " " + obj3.izindeMi);
		scan.close();

	}

	public static void staticMethod() {

	}

	public void method() {
		System.out.println(sayi); // bu method static olmadigi icin instance veriable lara direk erisebilir
	    sayi=sayi+20;             // ve bu method icerisinde gecerli olmak uzere degerini degistirebilir

	}

}
