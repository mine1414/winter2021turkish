package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip 
       // bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
		//Kullanicinin hata yapmadigini farz edin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic ve bitis harfinizi yaziniz");
	    char bas=scan.next().toUpperCase().charAt(0);
	    
		System.out.println("Lutfen bitis harfinizi yaziniz");
	    char bitis=scan.next().toUpperCase().charAt(0);
       
        for (char i =bas; i <=bitis; i++) {
			System.out.print(i+ " ");
		}
        System.out.println(" ");
        
        // while loop ile
        //baslangic degeri var--> bas
        while (bas<=bitis) {            //z naslangic secilse a bitis secilse yazdirmaz 
			System.out.print(bas+" ");
			bas++;
		}
         
       scan.close(); 		
        
	}

}
