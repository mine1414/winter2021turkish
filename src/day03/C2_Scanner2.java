package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//Kullanicidan ismini isteyip ilk harfini buyuk harf olarak yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		// scan next nokta yaptiktan sonra data tipini secmeden buyuk kucuk harf metodunu seceriz
		//sonra tekrar nokta yapip char secilir ilk harf icin 0 alinir
		//normalde scan nokta yapardik ama char icin scan nokta next nokta yapilir
        //char dan sonra nokta koysan birsey cikmaz cunku primitivlerin metodlari olmaz
		//bundan dolayi once buyu harf olayini yaptik
		//stringde harflerin indexleri 0 dan baslar
		//biz ilk harf almak istedigimiz icin index olarak 0 girmeliyiz
		
		System.out.println("bas harfiniz:" + ilkHarf);
		//eger charAt(0)yazdiktan sonra . koyarak methodlar gelmez
		//cunku charAt(0) methodu kullanilinca veriable imizi char yapmis oluruz
		//char primitive data tipindedir ve
		//primitivlerin metodlari olmaz
		
		scan.close();
	}

}
