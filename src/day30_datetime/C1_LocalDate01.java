package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		//Java da sadece tarih kullanmak istiyorsak LocalDate 
		//classindan bir obje uretiriz
		
		LocalDate tarih=LocalDate.now();//now simdiki zamani veriyor
		System.out.println(tarih);//2021-03-19
		
		System.out.println(tarih.plusWeeks(20));//2021-08-06   20 hafta sonra
        System.out.println(tarih.plusDays(500));//2022-08-01
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));//2024-08-31
        
        System.out.println(tarih.minusMonths(15));//2019-12-19 15 yil once
        System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));//2017-11-09
        
        System.out.println(tarih.getDayOfYear());//yilin kacinci gunu
        System.out.println(tarih.getMonthValue());//kacinci ay
        System.out.println(tarih.getDayOfWeek());//Haftanin hangi gunu friday
        LocalDate dogumGunu=LocalDate.of(1989, 04, 02);
        System.out.println(dogumGunu.getDayOfWeek());//sunday
        System.out.println(tarih.getMonth());//hangi ay march
        
        System.out.println(tarih.isLeapYear());//false
        
        //eger suan ki tarih ile degilde eski bir tarih ile islem yapacaksak
        //LocalDate.of() methodunu kullaniriz
        
        LocalDate tarih1=LocalDate.of(1995, 12, 15);//kullanicidan alirsak degerlerin yerine ay yil gun yazip dinamik yapariz
        LocalDate tarih2=LocalDate.of(1995, 12, 10);
        
        System.out.println(tarih1.isAfter(tarih2));//tarih1 tarih2 den sonra mi ==>true
        System.out.println(tarih1.isBefore(tarih2));// tarih1 tarih2 den once mi ==>false
		
       
		

	}

}
