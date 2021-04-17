package day07_iflstatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin
		//harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter harf giriniz");
		char karakter=scan.next().charAt(0);//char karakter=scan.next().charAt(0); yapinca buyuk harf girilince hata veriyor.
		                                    // lovercase yapabiliriz
		
		if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')) { //Yada bu sekilde veya deyip buyuk harfi de ekleyebilirz
			System.out.println("Girdiginiz karakter harf");
		} else {
            System.out.println("Girdiginiz karakter harf degil");
		}
		scan.close();
	}

}
