package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		/*
		 * icice try-catch yerine 
		 * bir tane try ve multiple catch blogu kullanabiliriz
		 * ancak bu durumda yazdigimiz exceptionlar arasinda parent-child iliskisi varsa 
		 * once child class'i yazmaliyiz
		 * aksi takdirde (yanionce parent yazilirsa )child'a is kalmaz
		 * java erisilemez catch-blogu diyerek CTE verir
		 */
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (FileNotFoundException e) { //once child exception yazdik
				
				e.printStackTrace();
			
		} catch (IOException e) {// sonra parent exception
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Kod bloke olmamis");



	}

}
