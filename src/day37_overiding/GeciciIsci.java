package day37_overiding;

public class GeciciIsci extends Formen {
	
	public String calsitigiBolum="Yemekhane";

	public static void main(String[] args) {
		
		//Overriding(gecersiz kilmak) methodlar ile ilgilidir
		//Bir child class'da parent class'dan miras alinan method'u degistirmeye overriding denir.
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
		
}
	//overriding yapmak icin parent class'daki method signature ile child class'da bir method olusturulur
	//signature oldugundan sadece body degisir
	//Boylece parent class'daki method child class icin gecersiz hale gelir
	
	public int maasHesapla() {
		return 30*8*10;
}

	@Override //annotation 
	public void mesai() {
		//super.mesai(); 
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}
	
   //annotation:aciklama,dipnot.
	//Java bu 25.satirda kodu inceleyenler icin bir aciklama getiriyor
	
	//annotation olmasi ile olmamasi arasindaki fark
	//annotation sadece bir aciklama degildir
	//ovveride yaptigimiz method'u surekli kontrol eder ve parent class'daki 
	//overridden method signature'i degistirilirse CTE verdirir
	
	//eger ovveride edilen parent class'daki method'un (override)'un da 
	//calismasini istiyorsak overriding method'un ilk satirina super() overridenMethodIsmi yazariz
	//eger overriding method'un ilk satirina super() yazilmazsa overridden method calismaz(Cosntructor 'dan farkli)
	
	//Access Midifier
	//Child Parent'i sinirlandiramaz
	//Yani overriding method'un modfier'i overridden method'un access modifier'indan dar olamaz
	
	//Retuyn Type
	//Overriden method'un return type'i primitive veya void ise 
	//overriding method'un return Type da ayni olmalidir
	//Eger return type primitive degilse 
	//(overriding methodun return type'i) IS-A  (overridden  methodun return type'i) olmalidir
	
}
