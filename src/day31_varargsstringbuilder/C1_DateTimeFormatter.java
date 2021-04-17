package day31_varargsstringbuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/hh:mm");
		/*
		 * yy:yilin son iki rakamini
		 * yyyy:yilin tamamini 
		 * M:ay sirasini verir mart icin 3 verir
		 * MM:ay sirasini verir mart icin 03 verir
		 * MMM:ay isminin ilk uc harfini verir
		 * MMMM:ay isminin tamamini verir
		 */
		System.out.println(dtf.format(ldt));//21/March/03:16
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMMM/dd");
		System.out.println(dtf2.format(ldt));//21/March/20
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm");//HH 24 saatlik sisteme gore
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm");//hh pm/am sistemine gore
		System.out.println(dtf3.format(ldt));//15:22  
		System.out.println(dtf4.format(ldt));//03:22
		
		 

	}

}
