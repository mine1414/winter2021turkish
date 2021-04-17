package day40_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

	@SuppressWarnings({ "unused", "resource" }) //@ isareti varsa anotation 
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");

		//try-catch blogu exception ile handle etmekte kullanilir
		//throws keyword'u ise sadece declaration'dir,dolayisiyla 
		//throws kullanilan birmethod'da exception olusursa KOD BLOKE olur
		int k=0;
		
		while((k=fis.read())!=-1) {
			System.out.println((char)k);
		}
		
		//Eger birden fazla exception icin throws keyword'u kullanacaksak
		//yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
		//eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa 
		//once child exception yazilmalidir,aksi takdirde child exc. erisilemez olur 
		
		//Eger yazacaklarimiz arasinda parent-child iliskisi varsa 
		//istersek sadece parent'i yazmamiz yeterli olur
	}
	

}
