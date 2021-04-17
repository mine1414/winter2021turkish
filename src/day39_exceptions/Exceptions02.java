package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 * eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa 
		 * Icice try-catch bloklari olusturabiliriz
		 *Bu ornekte ilk once dosyayi okutmak istedik
		 *Java "Ya dosyayi bulamazsam?" diye bizden yardim istedi
		 *bizde try-catch blogu ile FileNotFpundException ile handle etmesinde yardimci olduk
		 *Sonra dosyadaki yazilari okumaya calsitik ve java yeniden "Ya dosyayi okuyamazsam" 
		 *diye yardim istedi
		 *Bizde try-catch blogu ile IOException ile handle etmesini sagladik 
		 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (IOException e) { //dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("Kod bloke olmamis");


	}

}
