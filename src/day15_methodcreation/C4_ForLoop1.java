package day15_methodcreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		//5 defa Hello world yazdiralim
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		//bunun yerine loop kullaniyoruz
		// ne yapacagimizi javaya soyluyoruz kac kere yapmasi gerektigini de soyluyoruz
		// tum looplarda 3 seyi yazmak zorundayiz
		//1)baslangic degeri
		//2)bitis degeri
		//3)artis degeri
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello World");
			
		for(int i1=1;i<=30;i1++)	{
			System.out.println(i1+ "Hello World"); // 1,2,3....Hello world
			
		
	}
		}
	//NOT: eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
	//NOT:loop da artis degeri pozitif oldugu gibi negatif te olabilir i--/i-=5 beser beser 
	//NOT:artis degeri 1 olmak zorunda degil farkli da olabilir
	//NOT:Eger loopun sarti hic true olmazsa loop body devreye girmez
	}
	
	
}
