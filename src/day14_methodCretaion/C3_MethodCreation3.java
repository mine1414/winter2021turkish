package day14_methodCretaion;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirark methodu calistirin

		ortalama(60, 70, 80.5); // buradakiler argument sayisidir
		ortalama(65,75);
		
	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) { // buradakiler parametre
		System.out.println("Girdiginiz uc sayinin ortalamasi: " + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("Girdiginiz iki sayinin ortalamasi: " + (sayi1 + sayi2) / 2);

	}

}
