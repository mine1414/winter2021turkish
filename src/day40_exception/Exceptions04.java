package day40_exception;

public class Exceptions04 {

	public static void main(String[] args) {
		//
		
		int arr[]= {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Ne olursa olsun bu satir yazilsin");
		}
		
		System.out.println("kod bloke olmamis");
		//Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir
		//Finally blogu catch ile ongordugum bir osrun oldugunda calistigi gibi 
		//ongormedigim durumlarda 
	}

}
