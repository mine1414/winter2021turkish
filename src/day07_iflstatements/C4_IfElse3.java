package day07_iflstatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		//yas 65 veya buyuse emekli olabilirsin yoksa emekli olamazsin yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsiniz");
		} else {
           System.out.println("Emekli olamazsiniz");
		}
		
		
     scan.close();
	}

}
