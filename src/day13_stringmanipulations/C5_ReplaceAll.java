package day13_stringmanipulations;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		
		String str="Java ogren,mutlu ol,Java candir 12345";
		System.out.println(str.replaceAll("Java","hava"));
		
		//replaceall() methodu replace() methoduna benzer ama 2 farki vardir
		//1-replace() methodu char kabul eder ama replaceall() kabul etmez
		//2-replaceall () methodu regexp kullanimina izin verir
		
		System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerone * yazacak
		System.out.println(str.replaceAll("\\W", "*"));
		
		System.out.println(str.replaceAll("\\d","."));// Sayilari yapar 
		System.out.println(str.replaceAll("\\D",".")); // sayi olmayanlari yapar

		System.out.println(str.replaceAll("\\s","&")); //bolsuk olan her seyi & yapar
		System.out.println(str.replaceAll("\\S","&"));
		
		System.out.println(str.replaceAll("\\d", ""));
		
	}

}