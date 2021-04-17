package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();//yazarsak bos bir stringbuilder olusturur
		System.out.println("sb1: "+sb1);
		
		StringBuilder sb2=new StringBuilder("mehmet");//icinde mehmet degeri olan bir StringBuilder uretir
		System.out.println("sb2: "+sb2);
		
		StringBuilder sb3=new StringBuilder(10); //10 karakter kapasitesi olan bir sb uretir 
		System.out.println("sb3: "+sb3);
		
		sb1.append(" Hoca");
		System.out.println("sb1 append:"+sb1);// Hoca
		
		sb2.append(" Hoca");
		System.out.println("sb2 append:"+sb2);//mehmet Hoca
		
		sb3.append(" Hoca");
		System.out.println("sb3 append:"+sb3);// Hoca
		
		System.out.println("sb1 uzunluk:"+sb1.length());//5 
		System.out.println("sb1 kapasite: "+sb1.capacity());//16  bir deger yazmadigimiz icin default degr 16 verdi
		
		System.out.println("sb2 uzunluk:"+sb2.length());//11
		System.out.println("sb2 kapasite: "+sb2.capacity());//22  basta 6 biz verdik 16 da defaulttan geldi 22
		
		System.out.println("sb3 uzunluk:"+sb3.length());//5
		System.out.println("sb3 kapasite: "+sb3.capacity());//10  basta 10 verdigimiz icin dolana kadar bu deger 
		
		//capacity hafiza yonetimi icin cok onemli deger verdigimiz sinirini biliyor 
		//kod yazilirken sabit uzunluk veya max uzunluk belli ise
		//3.method ile olusturarak hafiza kullanimini optimize edebiliriz
		
		
	
		

	}

}
