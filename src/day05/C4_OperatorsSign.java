package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// =atama/assigment isareti
		
		int sayi1=5;
		int sayi2=4;
		boolean isGreat=sayi1>sayi2; //sonuc true/false olabilir bundan dolayi bolean yapmak lazim
		System.out.println(isGreat);
		
		boolean isSmall=sayi1<=sayi2;// kucuk esittir isaretinin yerine geciyor
        System.out.println(isSmall);
        
        boolean isEqual=sayi1==sayi2; //esit mi anlamina gelir ve comparison operator
        System.out.println(isEqual);//F
        System.out.println(sayi1==5);//T
        System.out.println(sayi1*sayi2==20);//T
        System.out.println(sayi1+sayi2!=9);//F esit degildir isareti
        System.out.println(sayi1-sayi2!=0);//T tum mantiksal ifadelerde ! kullanildiginda olumsuzluk anlami katar
	}

}
