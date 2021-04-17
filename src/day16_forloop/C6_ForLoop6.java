package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		//Interview Question Kullanicidan bir String isteyin 
		//ve Stringi tersine ceviren bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println(("Lutfen tersine cevirmek icin yazi giriniz"));
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i>=0  ; i--) {
			
			System.out.print(str.charAt(i));
		}
		scan.close();
		
		//2.yol
		System.out.println("");
	
		String tersYazi="";
		
		for (int i = str.length()-1; i>=0  ; i--) {
			tersYazi+=str.charAt(i);
		}
		System.out.println("girdiginiz yazinin tersten yazilisi:" + tersYazi);
		
		
		
		//3.yol
		tersineCevir(str);
		
	}

	private static void tersineCevir(String str) {
		
		System.out.println("Girdiginiz yazinin tersi method ile : ");
		for (int i = str.length()-1; i>=0  ; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
