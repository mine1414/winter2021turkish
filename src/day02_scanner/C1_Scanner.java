package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

   public static void main(String[] args) {
	   //Scanner ile kullanicidan bilgi akabiliriz 
	   //3 adimda scanner islemini gerceklestiriyoruz
	   //1.ADIM scanner Objesi olusturacagiz
	   
	   Scanner scan=new Scanner(System.in);
	   
   //new:Java da ne zaman new kelimesini gorsek yeni bir object olusturuluyor demektir
   //Parantezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekir   
   //Bir kod yazildiginda hata veriyorsa kodun altinda kirmizi cizgi olusuyorsa scanner(alti kirmizi olan yere) olan kisma gelince import scanner java util yapinca ihtiyac olan kodlari classa imporrt etmemiz yeterlidir. 
  //java util javanin bizim icin hazirladigi bir kutuphanedir,ihtiyacimiz oldugunda kodlari classa import etmemiz yeterlidir.
  //Scan(istedigimiz ismi yazariz ama tum kullanicilar tarafindan kabul edilir) olusturdugumuz scanner objesine verdigimiz isimdir.
   
	   //2.adim kullaniciya bir mesaj verin
	   System.out.println("Karenin bir kenar uzunlugunu girin");
	   
	   //3.adimda kullanicinin konsola girdigi degeri programimiza alacagiz
	   //ve bir veriabla olusturup bu degeri atayacagiz
	   //kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayi da girebilir
	   //buyuk bir sayi da yazabilir,tam sayi da yazabilir, virgullu sayi da yazabilir
	   
	   double kenar=scan.nextDouble();
	   
	   System.out.println(kenar*kenar);
	   System.out.println("girdiginiz kenar uzunluguna sahip karenin alani="+kenar*kenar);
   
    scan.close();
   
   }
   
   
   
 
}
