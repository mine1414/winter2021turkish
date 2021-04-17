package day07_iflstatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullanicidan ucgenin kenar uzunluklarini alin 
		//uc kenar esitse eskenar yazdirin
		//yoksa eskenar degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) { //uclu esitlik calismaz k1=k2=k3
			System.out.println("Eskenar ucgen");
		} else {
           System.out.println("Eskenar ucgen degil");
		}

		
		scan.close();
	}

}
