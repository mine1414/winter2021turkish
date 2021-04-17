package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		//kullanicidan pozitif bir rakam girmesini isteyin
		//girilen rakama gore asagidaki sekli cizdirin
		//*
		//* *
		//* * *
		//* * * *
		Scanner scan=new Scanner(System.in);
		System.out.println("10 dan kucuk pozitif bir tam sayi girin");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <sayi; i++) {
			
			for (int j = 1; j <i; j++) {
			System.out.print("* ");	
			}
			System.out.println("  ");
		}
        scan.close();  
	}

}
