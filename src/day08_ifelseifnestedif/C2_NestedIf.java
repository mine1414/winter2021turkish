package day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		// verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini 
		//yazdiran bir java prigrami yazdirin
		//eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//calisan erkekse 65 yasindan buyukse emekli olabilir
		
		String cinsiyet="Erkek";
		int yas=65;
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
			System.out.println("Emekli olabilir");
		} else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("Emekli olamazsin");
	     } else if(cinsiyet.equalsIgnoreCase("kadin") && yas>=60 ) {
	    	 System.out.println("Emekli olabilirsin");
	     } else if (cinsiyet.equalsIgnoreCase("kadin")&& yas<65) {
	    	 System.out.println("Emekli olamazsin");
	     } else System.out.println("Cinsiyet veya yas tanimsiz ");
		
		
		System.out.println("Nested if ile sonuc");
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			if (yas<0) {
				System.out.println("Yas negatif olamaz");
			} else if(yas<65) { 
				System.out.println("Emekli olamazsin");
			} else {
				System.out.println("Emekli olabilirsin");
			}
			
	  }else if (cinsiyet.equalsIgnoreCase("kadin")) {
			if (yas<0) {
				System.out.println("Kadin yas negatif olamaz");
			} else if(yas<60) {
				System.out.println("Bu yastaki kadin emekli olamaz");
			} else {
				System.out.println("Bu yastaki kadin emekli olabilir");
			}
			
			
		} else {
			System.out.println("Yazdiginiz cinsiyet sisteme kayitli degil");
		}
		
		
		
		
		
		
	}

}
