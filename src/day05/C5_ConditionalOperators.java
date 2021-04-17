package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// conditional(sart)
		//AND &&, OR ||
		//and operatoru mukemmelliyetci ikisi t olunca T 
		
		boolean isTrue=5>4 && 7-3>0; //T and T hepsi T ISE sonuc T
		                             //diger durumlarda T olmuyor mukemmelliyetci
        System.out.println(isTrue);
        
        int x=10;
        int y=5;
       System.out.println(x/y==2 && x*y>20 && x-y>0);//T and T and T
       System.out.println(x+y<0 && x-y>0);// F and T 
       
       //or operatoru ise optimisttir.
       //verilen karsilastirmalardan 1 tanesi bile dogru ise sonuc t olur 
       System.out.println(x<y|| x+y<0 ||x*y>0);// F or F or T SONUC T
	}

}
