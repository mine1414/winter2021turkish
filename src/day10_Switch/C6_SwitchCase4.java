package day10_Switch;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// Kullanicidan VIP kisaltmasindan hangi harfin anlamini istedigini soralim 
		//girilen harfin aciklamasini yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen harf giriniz");
		String harfkisaltma=scan.next().toUpperCase(); //char harf=scan.next().charAt(0)
		                                               // Burada vali yazinca da v yi aldigi icin pub olur
		
		switch(harfkisaltma) {
		case "V":
			System.out.println("very");
			break;
		case "I":
			System.out.println("Importent");
			break;
		case "P":
			System.out.println("person");
			break;
	   default :
		   System.out.println("Girilen harf yanlistir");
		}
		
		scan.close();

	}

}
