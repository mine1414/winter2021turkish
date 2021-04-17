package day33_encapsulation;

import day20_scope.Scope1;
import day21_Scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
        // Object Oriented Programing
        // Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
        // baska class'larda tekrar tekrar yazilmamasi, var oldugu class'dan obje uretilerek
        // bu variable ve method'larin istendigi kadar kullanilmasidir. (reusability)
        // Write Once Reuse Anywhere
        
        // scope6 class'indaki variable ve methodlara ulasmak istiyorum
        // bunun icin Scope6 class'indan obje uretmeliyiz


		Scope6 obj1 = new Scope6();
		// esitligin sol tarafi declaration
		// declaratio 2 parcadir (int number gibi) ilk parca data turu 2. kisim da isim
		// non-primitive'ler icin data turu ayni zamanda class ismi olabilir(String
		// array scaner list scope bunlar class ismi var
		// esitligin saginda ise deger,2 parcadan olusur
		// new keywordu,ikincisi de contructor
		// hagi class'dan obje uretmek istersek o calss'in constructor'inin kulllaniriz
		
		obj1.num1 = 10;
		System.out.println(obj1.num1);// 10

		obj1.add();
       //deneme methodunu main method icinden cagorabilir miyim?
		//deneme(); methodu static olmadigi icin main methoddan direk cagirilamaz
		//bunun yerine icinde oldugumuz calss'dan bir obje uretip onun uzerinden 
		//ststic olmayan methodlari da cagirabiliriz
		
		Encapsulation01 obj3=new Encapsulation01();
		obj3.deneme();
		
	}

	public void deneme() {
		// Projemiz kapsaminda bulunan tum classlardan public veriable ve methodlara
		// istedigin yerden obje ureterek ulasabilirim
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska
		// packageden ulasmak icin extra islem yapmamiz gerekir

		Scope1 obj2 = new Scope1();
		obj2.isim = "Ahmet";
		obj2.soyisim = "Ozcelik";
		obj2.sayi=15;
		obj2.method();
		
		//ben istedigim class'dan obje uretip oradaki public class uyelerine ulasabilirim

	}
}
