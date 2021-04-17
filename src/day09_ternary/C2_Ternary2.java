package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		int y=1;
		int z=1;
		int a=y<10?y++:z++; //int a=y++; postincrement once islem sonra arttirma
		                    // ++y olsaydi pre increment once arttir sonra islem
		
		System.out.println(y+ ","+ z + ","+ a);
		
		System.out.println(y++); 	// y=2 sonra 3
		System.out.println(++y);    //y=4 
        System.out.println(y);      // y=4
	}

}
