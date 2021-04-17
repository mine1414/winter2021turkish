package day22_constructor;

public class CarUret {
	 // SORU.....Constructor bu classda nerede ?
    //su anda bu calss da gorunur bir constructor yok
	//bir class olusturuldugunda Java bu class dan once obje uretecegini bilir 
	// ve gorunmeyen DEFAULT CONSTRUCTOR 'i classa yerlestirir
	//default constructor parametresizdir dolayisiyla sadece hic bir ozelligi tanimlanamayan 
	//objeler uretir(tisort uret)
	//default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	//eger biz sonradan constructor yazarsak java default constructor'u iptal eder
	
	//bir constructor olusturalim
	public CarUret (){
		
	}
	//kurallar:
	//1-ismi class ismi ile ayni olmalidir(dolaysiyla buyuk harfle baslar)
	//2-constructor return type'a sahip degildir
	//3-constructor isminden sonra mutlaka parantez olur ()ama parametre olmasi opsiyoneldir
	//4-bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin acces modifier  yazilir
    String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
    
	//bir programda cok fazla uretecegimiz objeler icin bir tane class olusturuz
	//bu class da olusturulacak objelere ait tum ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasa da olur
	//(Kaliphane gibidir)


    public void yakit(String yakit) { //method
		System.out.println("Araba yakit olarak "+ yakit+ "kullanir");
	}
	
	public void vites (String vites) {
		System.out.println("Araba "+ vites + "viteslidir");
		
	}

}
