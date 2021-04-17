package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {
 
	//kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("alanini hesaplamak icin dairenin yaricapini girin");
		// BU KISMA NE ISTEDIGIMI YAZIYORUM
		//kullanicidan yaricap istedim
		//kullanicinin girdigi yaricapi icine koyabilecegimiz bir degisken olusturmaliyiz
		
		
		double yaricap= scan.nextDouble();
		//yaricap isminde veriable olusturduk
		//Scan.nextDouble kullanicinin girdigi degeri alir
		
		System.out.println("dairenin alani=" + 3.14*yaricap*yaricap);
	scan.close();
	}
}
