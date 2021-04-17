package day14_methodCretaion;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		
        toplama(60.2,50);  // 1.double olan 2.method oldugu icin onu yazar
        toplama('a','b');  // char calisir ve ascii degerlerini yazar
        toplama("Ali","veli"); // string calisir ve concatination yapar
        toplama(50,60.2); // int char a uydugu icin onu yazar
	}
    
	public static void toplama(int sayi1,int sayi2) {
	System.out.println("integer method sonucu: " +(sayi1+sayi2));	
	
}
	public static void toplama(double sayi1,double sayi2) {
		System.out.println("Double method sonucu: " +(sayi1+sayi2));	
		
}
	public static void toplama(char char1,char char2) {
		System.out.println("Char method sonucu: " +(char1+char2));	
		
}
	public static void toplama(String str1,String str2) {
		System.out.println("String method sonucu: " +(str1+str2));	
		
}
	public static void toplama(int sayi1,double sayi2) {
		System.out.println("integer/double method sonucu: " +(sayi1+sayi2));	
		
}
}
