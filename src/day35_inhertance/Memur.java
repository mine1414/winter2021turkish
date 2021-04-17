package day35_inhertance;

public class Memur extends Personel{

	public int maas;
	
	public Memur() {
		//super(); 
		System.out.println("Child class parametresiz constructor calisti.");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}

	/*
	 * Inheritance'de constructor olusturdugumuzda java'nin otomatik olarak constructor'a 
	 * koydugu super() keyword onemlidir
	 * super() keyword default cons. gibidir.biz gormesek de calisir,ancak yerine baska
	 * bir keyword yazarsak etkisiz hale gelir
	 * ***extends varsa yerine birsey yazmadikca super() calisir
	 * super. yazarsak parent classdan ver veya method cagirir
	 * child methodda olmazsa parentte de bakilir
	 */
	
	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);
		
	
		

	}

}
