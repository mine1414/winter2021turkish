package day21_Scope;

public class Scope4 {

	public static void main(String[] args) {

		int sayi = 10;
		//1-System.out.println(isim); bir method icinde olusturulan veriable sadece o method icinde kullanilabilir
		int sayi2;// bir local veriable deger atnamadan da olusturulabilir
		//2-System.out.println(sayi2); ancak ilk deger atmasi yapilmayan veriableler kullanilamaz
		//2-sayi2++; ilk deger atnamadigi icin arttirma yada azaltma yapamayiz
		//2-Java deger atmasi olmadan local veriable olusturulmasina izin verir ilerde deger atnacak diye bekler
		
		sayi2=15; // 2-olusturma ayri satirda(9.satir) deger atamasi ayri satirda yapilabilir(13. satir)
		// 3- birden fazla method'un oldugu class'larda her method'da kullanmamiz gereken
        // 3- ortak variable'lar varsa class level'da variable olusturmaliyim
        // 3- ortak variable class'in yapisina bagli olarak instance veya static olabilir

	}

	public static void staticMethod() {

		String isim = "Hasan";
		//1-System.out.println(sayi); B u kurala main method icerisinde olusturulanlar da dahil

	}

	public void method() {
		
		boolean isTrue = true;
		//1-System.out.println(sayi); bu kural static olan veya olmayan kurallar icin gecerlidir

	}

}
