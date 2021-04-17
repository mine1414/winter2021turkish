package day42_abstractclasses;

public abstract class Personel {
	//1)abstract nasil yapilir?
	//bir class'i abstract yapmak icin class keyword'unden once
	//abstract yazmak yeterlidir
	
	//2) abstract bir class'in icinde veriable olabilir mi?
	//olabilir
	
	public String isim="Yasin";
	
	//3)veriable'ler abstrackt olur mu?
	//olmaz
	//ornek: public abstract int sayi=10;
	
	//abstract class'in tum concrete child'lari abstract class'daki tum 
	//dinamik ozellikleri yani methodlari  override etmek zorundadir
	
	//4)bir method abstract olur mu ve nasil yapilir?
	//olur
	public abstract void maasHesapla();//body'si yok!
	public abstract void mesaiBilgisi();
	
	//5)bir abstract class'da concrete method yazilabilir mi?
	//yazilir
	//concrete child class'lar abstract methodlari ovvveride etmek zorundadir.
	//Ama concrete methodlari override etmek istege baglidir.
	
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigorta kapsamindadir");
	}
	
	

}
