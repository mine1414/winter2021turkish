package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// java da ayni isimle birden fazla method olusturulursa buna overloading denir
		//overloading yapabilmek icin method signature larinin farkli olmasi gerekir
		//method signature=isim+parametre+parametre data turu
		// birbirini kapsaya, data turleri oldugunda java en optimum cozumu uretir
		//(birebir uyan varsa onu calistirir yokksa en fazla uyan methodu kullanir)
		//eger kapsayan bir method bulamazsa java CTE verir
		
		
	        toplama("Ali","veli"); 
	       
		}
	    
		public static void toplama(int sayi1,int sayi2) {
		System.out.println("integer method sonucu: " +(sayi1+sayi2));	
		
	}
		public static void toplama(double sayi1,double sayi2) {
			System.out.println("Double method sonucu: " +(sayi1+sayi2));	
			
	}
		public static void toplama(char char1,char char2) {
			System.out.println("Char method sonucu: " +(char1+char2));	
			
	}
		public static void toplama(String str1,String str2) {
			System.out.println("String method sonucu: " +(str1+str2));	
			
	}
		public static void toplama(int sayi1,double sayi2) {
			System.out.println("integer/double method sonucu: " +(sayi1+sayi2));	
			
	}

	}


