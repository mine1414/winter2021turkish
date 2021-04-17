package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin ve asagidaki 3 durumdan uygun olani yazdirin
		//1-Cumle java icermiyor
		//2-cumle 1 tane java iceriyor
		//3-cumlede birden fazla java var
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java"); // -1 Yada ilk javanin indexini
		int sonJava=cumle.lastIndexOf("java") ; // -1 yada son java nin indexi
		
		 if (ilkJava==-1) {
	         System.out.println("cumle java icermiyor");
	     } else if(ilkJava==sonJava){
	         System.out.println("cumle 1 java kelimesi iceriyor");
	     } else {
	         System.out.println("cumle 1'den fazla java iceriyor");
	        }
scan.close();

	}

}
