package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		// Kullanicidan bir sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		char ilkHarf=scan.next().charAt(0); //girillen ilk sifrenin karakterini alir
		
		if (ilkHarf>='A'&& ilkHarf<='Z') {     //ilkharf buyuk ise
			if (ilkHarf=='A') {
				System.out.println("Sifre gecerli");
			} else {
                System.out.println("Sifre gecersiz");
			}
			
		}else if (ilkHarf>='a' && ilkHarf<='z'){  //ilkharf kucuk ise
			if (ilkHarf=='z') {
				System.out.println("Sifre gecerli");
			} else {
                System.out.println("Sifre gecersiz");
			}
			
		}else { //ilkharf buyk veya kucuk degilse
                System.out.println("Sifre gecersiz,Lutfen ilk karakteri harf yapiniz");			
		}
		scan.close();
	}

}
