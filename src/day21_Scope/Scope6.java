package day21_Scope;

public class Scope6 {

	 public int num1;   // INSTANCE VERIABLE //acces modifier publicyapilinca heryerden ulasilabilir
	String name = "Ali"; //INSTANCE VERIABLE  //access modifier yazilmadigi icin default access modifier gecerlidir.
                                            //sadece paket icinde kullanilabilir
	public static void main(String args){ 
	  add();
	//product (5); statik olmayan bir method static olan main method icerisinden cagiralamaz
	}
	
	public static void add(){
	// num1 ++;  statik olmayan instance num1 static olan  method icerisinden kullanilamaz
	int num2 = 6; //LOCAL VERIABLE
	char letter; //LOCAL VERIABLE
	System.out.println("Do addition ");
	}
	
	public void product(int num3){ // num 3 LOCAL VERIABLE
	name = "Veli";
	//num2++;  ustteki methodda olusturulmus local bir veriable dir.
	System.out.println(num3 * num3);
	


	}

}
