package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// concatenation:Java da toplama islemi yapilirken eger toplanan ifadelerden biri veya
		//her ikisi string ise java toplama degil BIRLESTIRME yapar 
		
		System.out.println(15 + 20 + "Merhaba"); //35Merhaba
		System.out.println("Merhaba" + 15 + 20); //Merhaba1520
		System.out.println("Merhaba" + (15+20)); //Merhaba35
		System.out.println("Merhaba" + 15 * 20); //Merhaba300
		
		String str1="Hello";
		String str2="World";
		
		//Hello World yazdirmak istersek
		System.out.println(str1+ " " +str2);
		//str1.concat(str2) methodu str1 in sonuna str2 ekler
		System.out.println(str1.concat(str2)); //HelloWorld
		System.out.println(str1.concat(" ").concat(str2)); //istenilen kadar concat yapilir
		System.out.println(str1.concat(" " + str2));
		

	}

}
