package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullanicidan bir string girmesini isteyin
		//girilen stringin son harfini buyuk harf olark yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz cumlenin on harfi:" + str.charAt(str.length()-1));
		
		//lenght() methodu girilen stringin uzunlugunu verir
		System.out.println(str); //kullanici ne girdiysse buyuk harfle yonu yazdirir
		
		String str2="";  //"Ali" ---> 4 olurdu
		System.out.println(str2.length()); // 0
		
		//String str3=null;    // "null" bu stringdir length-->4 derdik.
		                    // null trdeki hic demek gibidir 
		                   // normalde stringler "" icine yazilir ama null icin buna gerek yoktur
		                  // null case sensitive dir, dolayisiyla NULL  veya Null yazilmaz
		                 // null bir deger degildir,sadce hicligi gosteren bir pointer dir
		                
		//System.out.println(str3.length());  //RTE VERIR 
		
		//System.out.println(str3.equals(str2)); //null deger atanan string ile string manipulation methodlari kullanilamaz
		System.out.println(str.charAt(1)); // indexi 1 olan(Bastan ikinci) harfi verir
		//System.out.println(str3.charAt(1)); // RTE Verir
		
		scan.close();
	}

}
