package day04_modulus;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
	int num1=38/2*(4+3)*2;
	System.out.println(num1); //266
	
	int num2=8+2*(14-6/2)-12;
	System.out.println(num2); //18

	int num3=10;
	double num4=num1*num2/num3; 
	System.out.println(num4); //Java once sag tarafi yapar
	                          // Sag taraf hep int oldugu icin sonucu intten yapti
			                  //sonra assigment atama islemi yapar
	
	double num5=24.56;
	double num6=14.2;
	double num7=num5/num6;
	System.out.println(num7);//1.729577464887323
	
	System.out.println(num5/num3);//2.456 double olarak kabul eder 
	                              //yani genis olana gore muamele
	
   double num8=num1*num2/num3;
   System.out.println(num8);
   
   double num9=(double) num1*num2/num3;
   System.out.println(num9); //478.8 sonuc virgullu yani double istersek basina double yazmak gerek
   
	}

}
