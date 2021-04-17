package day19_count;

public class C6_Scope {

	public static void main(String[] args) {
		//bir class icerisinde olusturulan veriable'larin nerede gecerli oldugu 
		//ve nerede kullanilabilecegi o veriable 'in scope'u belirler
		//google Java scope nedir bak
	
		int sayi=10;
		denemeMethod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);

	}

	public static void denemeMethod() {
		//sayi=20;
		String isim="Mehmet";
	}

}
