package day10_Switch;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		//kullanicidan hangi gunde oldugumuzu yaziyla isteyin
		//girilen gunun hafta ici veya hafta sonu oldugunu yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugumuzu giriniz");
		String gunIsmi=scan.next().toLowerCase(); //hepsi kucuk
		
		switch (gunIsmi) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("hafta sonu");
			break;
		default:
			System.out.println("gecerli bir gun ismi giriniz");
			
			
			scan.close();
		
		}
			

	}

}
