package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		//Java da 2 tur data tipi vardi
		//primitive ve nonprimitive 
		//p ler sadece value(deger) icerir,np ler ise deger ve method icerir
		
		String isim="mehmet";
		System.out.println(isim.toUpperCase());
		
		//Wrapper Class: javanin primitiv data turleri ile bazi methodlari 
		//kullanabilmemiz icin  olusturdugu Class lardir
		//boolen,char,byte,short,int,long,float,double
		
	   	Byte sayi2=11;// pr data turu kucuk harfle baslar 
		              // ismen pr data turu ile ayni olan np datalara wrapper denir
		System.out.println(sayi2);
		
		Byte byteMinSayi=Byte.MIN_VALUE; //wrapper sayesinde p data turlerinin degerlerini bulmus oluyoruz
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi=Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		//veriable olusturmadan shortun en kucuk ve en buyuk degerlerini yazdiralim
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		//Integer veri turunun wrapper classi Integer
		//integer en kucuk ve en buyuk degerleri yazin
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//Boolean,Character,Byte,Short,Integer,Long,Float,Double
	
		
		
		
	}

}
