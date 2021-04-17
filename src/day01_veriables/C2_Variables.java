package day01_veriables;

public class C2_Variables {
   
	public static void main(String[] args) {

	int sayi; // ; yazim dilindeki . gibidir:java ;u gorunce o satirdaki kod yaziliminin bittigini   
   sayi=27;
   System.out.println(sayi); // Eger println degilde print yazarsak alt satira gecmez
   
   char ilkHarf='M';
   
   System.out.println(ilkHarf); // Println yazinca yazma isleminden sonra alt satira gecer
   
   double sayiDouble = 5.34;
   
   System.out.println(sayiDouble); 
   
   System.out.println(sayi + sayiDouble);
   
   System.out.println(sayi + ilkHarf); // M harfinin asci degeri 77 oldugu icin ttl 104 oldu
   
   System.out.println(ilkHarf+sayi);
	
	
	}
}



