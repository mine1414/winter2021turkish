package day35_inhertance;

public class Personel {
	public String isim;
	public int sayi;
	
	public Personel() {//parametresiz cons.
		/*super();
		 * Kavadan yardim alarak bir cons. olustrudugumuzda 
		 * java cons.'in ilk satirina super(); keywor'unu ekler.
		 * eger icinde oldugumuz class bir child class degilse super(); keyword'u silinebilir
		 * Bugune kadra biz olusturdugumuz cons.'larda hic super (); keyword'u kullanmadik
		 * ancak bizim calsslarimiz child class olmadigindan sorun olmadi
		 */
		
		System.out.println("Personel parametresiz constructer calisti");
	}

	public Personel(String isim, int sayi) { //parametreli cons.
	//	super();
		System.out.println("Personel parametreli constructer calisti");
		
		
		
	}
	
	
    /*HATIRLATMA;
     * Her class deafult constructor'a sahiptir.
     * Default constructer'in parametsresi yoktur.
     * Biz parametreli veya parametresiz bir constructer olusturdugumuzda default constructer silinir.
     * Eger biz sadece bir tane parametreli cons.olusturursak,Java defalt olani sildigi icin 
     * parametresiz cons.kalmaz
     * Dolayisiyla parametreli bir cons.olusturdugumuzda default cons.yerine de 
     * parametresiz cons. olusturmamiz gerekir
     */
}
