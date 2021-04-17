package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir integerein birler basamagindaki rakami yazdirin
		//verilen dedigi icin kullanicidan almiyoruz
		//kullanicidan deseydi scanner yapardik
		
		int sayi=1469;
		System.out.println("verilen sayinin birler basamagi:" +sayi%10); //9
		
		//Verilen sayinin birler basamagi haric geriye kalan basamaklari yazdirin
		
		System.out.println(sayi/10); //146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		//sayi/10 ile sayi/=10 arasindaki fark nedir
		//= Isareti atama (assigment) demektir
		//bir islemde = isareti varsa orada deger kalici olarak degisir
		//= isareti yoksa sadce o anlik matematiksel bir islem yapar
		// sayi/10 Yazilirsa sayinin degeri degismez
		// sayi/=10 Yazilirsa sayi 10 a bolunur ve yeni deger olarak sayiya atanir
		
		
		
		
		

	}

}
