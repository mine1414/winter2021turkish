package day13_stringmanipulations;

public class C6_SubString {

	public static void main(String[] args) {
		
		String str="Her ders Java gibi olsa";
		
		//str in ilk 10 harfini * ile gizleyin
		//geriye kalanlar normal yazilsin
		 
		System.out.println(str.substring(10)); //10.index dahil(inclusive)sonuna kadar tum string
		
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdirin
       
		//ilk 10 karakteri alma
		System.out.println(str.substring(0, 10)); //substring (0,10) yazildiginda
		                                          //0 inclusive(dahil) 10 exclusive dahil degil
		
		//11. ci karakterden sonuna kadar olan stringi yazdiralim
		System.out.println(str.substring(10));
		
		System.out.println(str.substring(10, 10));
		
		//str'in ilk on harfini * ile gizleyin geriye kalanlar normal yazsin
		System.out.println("**********"+str.substring(10));
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+ str.substring(10));
		
		//System.out.println(str.substring(10, 10)); //RTE
		System.out.println(str.substring(22));
		System.out.println(str.substring(23));
		//System.out.println(str.substring(24)); //RTE
		
		String str3=str.substring(0, 10);
		str3=str3.replaceAll("\\w","a");
		System.out.println(str3.replaceAll("\\w", "*")+ str.substring(10));
		
		
	}

}
