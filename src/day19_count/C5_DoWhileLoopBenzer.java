package day19_count;

import java.util.Scanner;

public class C5_DoWhileLoopBenzer {

	public static void main(String[] args) {
		
		// Kullanicidan kullanici adi isteyin kullanici adini sartlara gore kontrol edin
		 // Kullanici adindaki hatalari yazdirin Gecerli kullanici adini girince
		 //"Kullanici adi kayit edildi" yazdirin
		
	 		 Scanner scan=new Scanner(System.in);
	 		 String kullaniciAdi = "";
	 		int sonuc = 0;
	 		
	 		do {
	 		 System.out.println("Lutfen bir kullanici adi giriniz: ");
	 		 kullaniciAdi = scan.nextLine();
	 	     sonuc = uzunlukKontrol(kullaniciAdi) + kucukHarfKontrol(kullaniciAdi) + buyukHarfKontrol(kullaniciAdi)
	 								+ ozelKarakterKontrol(kullaniciAdi);
	 	    } while (sonuc != 4);
		System.out.println("Kullanici adiniz kayit edilmistir!");
	 					
	 		scan.close();
}
	
	      public static int uzunlukKontrol(String kullaniciAdi) {
	      int sonucUzunluk = 0;
	      if (kullaniciAdi.length() < 8) {
	    	  System.out.println("Kullanici adi 8 karakterden kucuk olamaz.");
			} else {
				sonucUzunluk = 1;

			}
	        return sonucUzunluk;
	      }
	      public static int kucukHarfKontrol(String kullaniciAdi) {

	    	  int sonucKucukHarf = 0;
	    	  int index = 0;
	    	  while (index < kullaniciAdi.length()) {
	    		  if (kullaniciAdi.charAt(index) <= 'z' && kullaniciAdi.charAt(index) >= 'a') {
	    			  sonucKucukHarf = 1;

	    		  }
                index++;
	    	  }
	    	  if (sonucKucukHarf == 0) {
	    		  System.out.println("Kullanici adi kucuk harf icermelidir. ");
	    	  }
	    	  return sonucKucukHarf;
	      }
	      
	      public static int buyukHarfKontrol(String kullaniciAdi) {
	    	 
	    	  int sonucBuyukHarf = 0;
	    	  int index = 0;
	    	  while (index < kullaniciAdi.length()) {
	    		  if (kullaniciAdi.charAt(index) <= 'Z' && kullaniciAdi.charAt(index) >= 'A') {
	    			  sonucBuyukHarf = 1;

	    		  }
              index++;
	    	  }
	    	  if (sonucBuyukHarf == 0) {
	    		  System.out.println("Kullanici Adi buyuk harf icermelidir.");

	    	  }
	    	  return sonucBuyukHarf;
               }
	      
	      public static int ozelKarakterKontrol(String kullaniciAdi) {
	    	  int sonucOzelChar = 0;
	    	  int index = 0;
	    	  while (index < kullaniciAdi.length()) {
	    		  if ((kullaniciAdi.charAt(index) <= '.' && kullaniciAdi.charAt(index) >=',')
	    				  || (kullaniciAdi.charAt(index) <= '9' && kullaniciAdi.charAt(index) >= '0')) {
	    			  sonucOzelChar = 1;
	    		  }
	    		  index++;

	    	 
	    	  }
	    	  if (sonucOzelChar == 0) {
	  			
	  			System.out.println("Kullanici Adi ozel karakter icermelidir.");
	  			
                 }
	    	  return sonucOzelChar;
	      
	      
}

}












	




