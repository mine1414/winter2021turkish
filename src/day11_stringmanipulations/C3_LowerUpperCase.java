package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.tolowerCase() verilen Stringin tamamini kucuk harfe cevirir
		//str.toUpperCase() verilen Stringin tamamini buyuk harfe cevirir
		
	 String str="Techproeducation";
	 //buyuk harfle yazdirmak istersek
	 System.out.println(str.toUpperCase());
	 
	 //Str i buyuk harfe cevirmek istersek
	 str=str.toUpperCase(); // BU satirdan sonra kalici olarak buyuk harflerden olusan string oldu
	 System.out.println(str);
		
	 System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		

	}

}
