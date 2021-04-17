package day33_encapsulation;

public class Encapsulation02 {
	private String okulIsmi="Yildiz Koleji";
	//okul isminin baska class'lardan okunmasini ama deger atanamamasini 
	//istiyorsak getter() method'u olusturuyoruz
	
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	//obje olusturarak deger atanip kullanilmasini istedigimiz ama
	//ilk atadigimiz degerin gorunmemesini istiyorsak setter() methodu kullaniriz
	
	public int sayi=100;

	public static void main(String[] args) {
		// Eger ulasmak istedidim class uyeleri(class member) public degilse baska
		//package'lerden ulasmak icin extra islem yapmamiz gerekir
		
		//Yapabilecegimiz islemlerden 1.si encapsulation (Data saklama)
		//bu class'da kimseyle paylasmak istemedigimiz veriable ve methodlar olusturalim
		
		//private yapinca guvenlik konusunu halletmis olduk 
		//ancak class uyelerinin private olmasi OOP concept'e aykiri
		
		//Encapsulation class'imizda olusturdugumuzda class uyelerine 
		//kimlerin ne oranda ulasabilecegini belirlemek icin yapilir

	}
     private void denemeMethod() {
    	 System.out.println("Deneme method'u calisti");
     }
	public String getOkulIsmi() {
		return okulIsmi;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
	
	
}
