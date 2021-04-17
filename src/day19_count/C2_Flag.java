package day19_count;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin 
		//cumlede buyuk harf varmi yok mu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		String flag="yok";
		int index=0;
		
		while (index<=cumle.length()-1) {
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="var";
			}
			index++;
		}
		System.out.println("verdiginiz cumlede buyuk harf "+ flag);
		
		scan.close();
	}

}
