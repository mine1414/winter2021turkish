package day42_abstractclasses;

public class IdariPersonel extends Personel{
	
	//extends Personel yazarak abstract personele concrete bir child olusturdum
	//ve java CTE verdi
	//cozum olarak urettigi 2 ihtimal var:
	//1-Unimplemented(uyarlanmamis)mathodlari uyarla
	//2-yada Personel class'indan abstract kelimesini kaldir
	// Bu class'in calisabilmesi icin 2 islemden birini yapmak zorundayiz

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//concrete bir class'ta abstract bir method olabilir mi?
	//abstract bir method sadece abstract bir class'ta olusturulabilir
	//public abstract void surekliClaisma();
	

	@Override
	public void maasHesapla() {
		System.out.println("Idari personel maasi 4000tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
