package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		//ben farkli classlardan da scope1 classina object olusturarak ulasabilirim
		
		Scope1 obj4=new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		obj4.soyisim="Can";
		obj4.isim="Ahmet";
		System.out.println(obj4.isim+ " "+ obj4.soyisim);
	

	}

}
