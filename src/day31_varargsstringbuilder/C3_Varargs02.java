package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
	//Istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
	// Var----variety cesitlilik args---arguments 
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7,-5);
			
	}

	public static void toplama(int... var) {//Data turunden sonra yazdigimiz 3 nokta varargs kullanacagimiz anlamina geliyyor
                                              //var varargs'in adidir.istedigimizi yazariz
		int toplam=0;
		for(int each:var) {
			toplam+=each;
		}
		 System.out.println("toplam: "+toplam);
	
	}

}
