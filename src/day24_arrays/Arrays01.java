package day24_arrays;

import java.util.Arrays;

public class Arrays01 {
	
	
	public static void main(String[] args) {
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30;		
		String isim="Ali";
		
		//java da birden fazla elemani koyabilecegimiz (store) objectler vardir
		//bugun ilkini gorecegiz
		
		int arr[]= {10,20,30};// int [] arr seklinde de kullanilabilir
		                      // Bu ornekte array'in elemanlarini direk yazdigm icin uzunluk belirtmeye ihtiyac kalmadi
		                      // Bu kullanimda max elemen sayisi(lenght) yazdigimiz eleman sayisidir
		                      //ayni data tipi kullanilmali icindeki sayilar degisebilir
		System.out.println(arr);// array bir objedir 
		                        //eger direk olarak Arrayi yazdirmak istersek java ref'i yazdirir
		
		System.out.println(Arrays.toString(arr)); //[10, 20, 30] bosluklu yazar
		
		String takim[]=new String[5]; // [null, null, null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim)); //[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));// [Ali, Veli, Hasan]
		
		//takim[5]="Mehmet"; //java Run time calisir dolayisiyla array programi calistirinca olusturulur.
		                  // 36. satirda sytax olarak hata olmadigindan CTE olmaz
		                  // program calistiginda 3.index olmadigi icin RTE verir
		
		// array'deki bir elemani uptade etme 
		//veli'nin yerine kemal gelsin
		takim [1]="Kemal";
		System.out.println(Arrays.toString(takim)); //[Ali, Kemal, Hasan]

		//Bir array'in uzunlugunu nasil bulabiliriz
		System.out.println(takim.length); //5  String'deki lenght() bu sekilde array de sadece lenght
		
		//Array'deki son elemani Mehmet yapin
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		//eger array eleman sayisi tek ise ortadaki elemani Can yapalim 
		
		if(takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Can";
			}
		System.out.println(Arrays.toString(takim));
		
	}

}
