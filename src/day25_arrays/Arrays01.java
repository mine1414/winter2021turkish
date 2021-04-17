package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//Array (dizi):javada birden fazla veriable store etmek icin kullanilan objelerden biridir
		//Array olusturulurken 2 sayi declare etmeliyiz:
		//1-data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar olabilir)
		//2-uzunluk (uzunluk array'in icerisine konulacak max eleman sayisini belirtir ve bundan fazlasini koymak
		//istersek RTE verir
		
		int arr[]= {10,23,54}; //length=3
		String isimler[]=new String[4]; //length=4 olan bos bir array olusturur
		
		//Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
		//Mesela isimler array'inin icinde isim degerleri degil isimlerin referanslari olur
		
		System.out.println(isimler[1]); // 2.elemani istersek bu sekilde cagiririz
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
		//Array'in tum elamanlarini yazdirma
		System.out.println(isimler); // referansini yazdirir
		System.out.println(Arrays.toString(isimler)); //[Elveda, null, Boss, null] parantezli sonuc arr olsugu belli
		
		//method kullanmadan tum elemanlari yazdiralim
		//loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.print(isimler[i]+ " "); // parantez yok ne oldugu belli degil
			
		}
        System.out.println();
        
        System.out.println(arr);//referans 
        System.out.println( Arrays.toString(arr));
        
        //Array'in elemanlarini nasil siralayabiliriz.Kucukten buyuge
        isimler[1]="Oguzhan";
        isimler[3]="Bilal";
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
	}

}
