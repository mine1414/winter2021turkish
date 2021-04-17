package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ //Istersek constructor'u parametreli olusturabiliriz 
		
	}
	//biz bir constructor olusturdugumuzda java default olani yok eder
	//dolayisiyla biz bir constructor olusturdugumuzda mutlaka 
	//default constructor'in yerine de bir constructor yazmalyiz
	
	public Otomobil() { // default constructorun yerine bunu yazmaliyiz
		
	}
	//ONEMLI NOT:default constructor disinda baska bir constructor yazdigimizda 
	//java default olani yok ettigi icin MUTLAKA biz default yerine de constructor yazmaliyiz
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) { //method
		System.out.println("Araba yakit olarak "+ yakit+ "kullanir");
	}
	
	public void vites (String vites) {//method
		System.out.println("Araba "+ vites + " viteslidir");
		
	}

}
