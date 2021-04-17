package day37_overiding;

public class Formen extends Isci{
	
	public String sorumluOldBolum="bakim";
	public String isim="Emrullah";

	public static void main(String[] args) {
		
		//inhertiance'de data turu olarak class ismi kullanimi
		//Bir class'da obje uretirken data turu olarak calss'in kendisini veya 
		//parent(larini) kullanabiliriz
		//Olusturdugumuz obje ile veriable kullanmamiz gerekirse,hangi degeri alacagini
		//anlamak icin once data turu olan class'a gideriz
		//oradada aradigimiz veriable varsa kullaniriz,yoksa parent(lar)ina bakariz
		//yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1=new Formen();
		//fr1. objesini kullanarak hangi class'larin veriabllelerini gorebiliriz
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=1000;
		System.out.println(fr1.isim+" "+ fr1.sorumluOldBolum+" "+fr1.maas);
		//Emrullah Marangozhane 1000 
		
		Isci fr2=new Formen();
		//Data turu olarak isci secildigi icin isci ve ustu class gorunur formen gorunmez
		fr2.bolum="Kaynak atolyesi";
		System.out.println(fr2.isim+" "+ fr2.bolum+" "+fr2.maas);
		//Mesut Kaynak atolyesi 5000 data tipi ne ise once ona bakar
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre
		

	}

}
