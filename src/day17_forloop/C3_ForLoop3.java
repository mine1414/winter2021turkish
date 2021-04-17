package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanicidan 40 dan kucuk pozitif bir sayi alin 
		//girinen sayinin faktoryelini hesaolayip yazdiran bir method olusturun
		//6!=1*2*3*4*5*6
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 35 den kucuk poztif bir tam sayi yazin");
		int sayi=scan.nextInt();
		
		if(sayi<=0 || sayi>=35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		}else faktoryelBul(sayi);
	
scan.close();
	}

	public static void faktoryelBul(int sayi) {
		
		long faktoryel=1; // bu faktoryelin datasi
		for (int i = 1; i <=sayi; i++) {
		     faktoryel*=i;
		    
		}
		 System.out.println(faktoryel);
		
			
		
		
	}

}
