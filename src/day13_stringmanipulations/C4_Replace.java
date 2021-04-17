package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// kullanicidan bir cumle isteyin
		//cumledeki tum bosluklari sildirin
		//tum a larin yerine e yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz");
		String cumle=scan.nextLine();
		
		cumle=cumle.replace(" ", "");
		cumle=cumle.replace("a", "e");
		System.out.println(cumle);
		// eger atama yaparsak cumle kalici olarak degistigi icin biz bir daha orjinal cumleye ulasamayiz
		// bunun icin kullanicidan aldigimiz str a degil yeni bir stringe atamak daha mantiklidir
		
		System.out.println("Lutfen bir cumle daha giriniz");
		String cumle2=scan.nextLine();
		System.out.println(cumle2.replace(" ", "").replace('a', 'e'));
		
		//hem a hemde e nin yerine i yazalim
		System.out.println(cumle2.replace("a","i").replace('e', 'i'));
		
		//hem a hemde e nin yerine i yazalim buyk kucuk harf gozetmeksizin
		System.out.println(cumle.toLowerCase().replace("a", "e").replace("e", "i"));
		
		
        scan.close();
	}

}
