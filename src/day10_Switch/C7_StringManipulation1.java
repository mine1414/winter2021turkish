package day10_Switch;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// Manipulation:degistirme,donusturme
		//string manipulation: string degistirme
	   //string non primitive data turundendir ve value birlikte metodlara sahiptirler
	   //methodalri kullanarak stringi degistirmeye string manipulation denir
		
		String str="Hello World";
		System.out.println(str.toUpperCase()); //HELLO WORLD  Gecici olarak degistiriyoruz ama ozu degismiyor
		
		System.out.println(str); //Hello World
		
		String str2=str.toUpperCase();
		System.out.println(str); //Hello World 
		System.out.println(str2);
		
		
				

	}

}
