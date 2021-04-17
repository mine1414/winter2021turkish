package day19_count;

import java.util.Scanner;

public class C3_DoWhileLoop1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	    int sayi=12;
	    
	    do {
	    	
	    	System.out.println("Lutfen pozitif bir tam sayi giriniz");
		    sayi=scan.nextInt();
			
		} while (sayi<=0);  //burasi istemedigim durum burasi true oldugunda tekrar calisir
	    System.out.println("aferin");
	    
	    
	    
	    scan.close();
	    
	}

}
