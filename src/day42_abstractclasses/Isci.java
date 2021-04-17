package day42_abstractclasses;

public class Isci extends Personel {

	public static void main(String[] args) {
		
		Isci isci1=new Isci();//Isciler icin maas 5000tl
		isci1.maasHesapla();//Isciler gunluk 8 saat calisir
		isci1.mesaiBilgisi();
		isci1.isim="Rumeysa";//Abastract parent class'taki veriable'leri istersem kullanabilirim
		System.out.println(isci1.isim);//Rumeysa
		//System.out.println(isim);
		isci1.ozelSigorta();//Abstract parent class'taki concrete method'u istersem kullanirim
                            //Bu personel ozel sigorta kapsamindadir
		                   //Bu method oveeride etmedik ama parent-child iliskisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
        //Parent class'taki abstract method'u implement(uyarlama)etti
		//1-sen abstract bir class'i parent edindiysen mutlaka oradaki
		//   abstract method'u implement etmelisin
		//2-Parent class'taki method'da body olmadigi icin onu kullanmanin anlami yok
		//bic child class'da body olan method(concrete)kullanip islem yapmaliyiz
		System.out.println("Isciler icin maas 5000 tl ");
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("Isciler gunluk 8 saat calisir");

	}

}
