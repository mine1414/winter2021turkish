package day21_Scope;

public class Scope1 {
	
	//Static veriable ler class level de olusturuldugu icin class her yerinden kullanilabilir
	//instance veriablaler static olmayan methodlarda direk kullanilabiliyorken static methodlarda object olusturularak 
	//kullanilabilir
	//static veriableler ise ister static istrese static olmayan tum methodlardan direk kullanilabilir
	static int okulId=1201;  // 
	static String okulAdi="Yildiz Koleji";
	static boolean acikMi;
	

	public static void main(String[] args) {
		
		System.out.println(okulId+ " "+ okulAdi + " "+ acikMi);
		okulId=1202;
		acikMi=true;
		staticMethod(); //method call
		
		System.out.println(okulId+ " "+ okulAdi + " "+ acikMi);

	}
	
      public static void staticMethod() {
		System.out.println(okulId+" "+okulAdi+" "+ acikMi);
		okulId=1203; // buradan sonra tekrar cagirilan yere gider yani 19.satira
		
		}
	
	public void method() {
		okulId=1205; // hic kullanilmadi bu class calistirildiginda bu method calismaz
		
	}

}
