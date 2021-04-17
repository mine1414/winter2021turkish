package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Javada saat ile islem yapmak icin
		//Localtime class'indan obje kullaniriz
		
		LocalTime saat=LocalTime.now();
		System.out.println(saat);//20:37:18.038238100
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
			}
		LocalTime saat2=LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat);
		
		System.out.println(saat.plusHours(15));
		System.out.println(saat.getSecond());
		System.out.println(saat.minusSeconds(12345678));
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		
		
	

	}

}
