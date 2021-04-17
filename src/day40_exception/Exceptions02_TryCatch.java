package day40_exception;

import java.util.Scanner;

public class Exceptions02_TryCatch {

	public static void main(String[] args) {
		// 

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		try {
			if(yas>=0) {
				System.out.println("Girdiginiz yas:"+yas);
			}else {
				throw new IllegalArgumentException();
			}
		}catch (IllegalArgumentException e) {
		   e.printStackTrace();
		}
		System.out.println("Kod bloke olmamis");
	}

}
