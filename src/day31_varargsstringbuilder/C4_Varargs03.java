package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		//verilen int'lardan ilki haric tum sayilari toplayin ve
		//buldugumuz toplam ile ilk sayiyi carpip sonucu yazdirin
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7,-5);

	}
	public static void toplama(int sayi1,int... var) {
       
		System.out.println("varargs'a dahil olmayan argument: "+sayi1);
		
		int toplam=0;
		for (int each : var) {
			toplam+=each;
		}
		
		System.out.println("varargs ile ilk sayi carpimi: "+toplam*sayi1);
}
}
