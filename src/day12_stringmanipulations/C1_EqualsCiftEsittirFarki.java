package day12_stringmanipulations;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		// 
		String str1="Ali Can";
		String str2=str1+ "";// Ali Can
		
		System.out.println(str1==str2);
		// == Stringlerin hem degerlerine hem de adreslerine bakar
		//bu ornekte str1+"" yazdiginizda concatination yapildigi icin Java yeni bir obje 
		//olusturur ve islemin sonucunu yeni objenin icine koyar 
		//str1 ve str2 'yi == ile karsilastirirsak degerleri ayni fakat daresleri farkli oldugu icin false doner
		
		System.out.println(str1.equals(str2));
		//equals() methodu sadece String lerin degerlerini karsilastirir
		//bu ornekte str1 ile str2 nin degerleri AYNI oldugu icin true dondurur
		
	//	String str3="Ali Can";
		String str3=str1;
		System.out.println(str1==str3); // true
		System.out.println(str1.equals(str3));  //true
		
		

	}

}
