package day03;

public class C3_DataCasting {
	// ilk baslarken kucuk degerler verilir sonra buyuk deger gerekirse diye kullanilir

	public static void main(String[] args) {
		// byte veri turunde bir degisken olusturup deger atayin
		//olusturulan veriable i adim adim AUTO WIDEINING ile genisletip yazdirin
		
		byte numByte=34;
		System.out.println("byte degisken degeri:" + numByte);
		
		//short yapalim
		short numShort=numByte;// short byte den buyuk oldugu icin Jva sikayet etmiyor
		                       // Auto wideining ile degeri short veriable ye atiyor
		System.out.println("short degisken degeri:" + numShort);
		
		//int yapalim
		int numInt=numShort;
        System.out.println("integer degisken degeri:" + numInt);
        
        //float yapalim
        float numFloat=numInt;
        System.out.println("float degisken degeri:" + numFloat);
        
        //Double yapalim
        double numDouble=numFloat;
        System.out.println("double degisken degeri:" + numDouble);
	}

}
