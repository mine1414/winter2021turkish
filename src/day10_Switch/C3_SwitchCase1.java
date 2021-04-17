package day10_Switch;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin
		//girilen rakami yazi ile yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam=scan.nextInt();
		
		if (rakam==0) {
			System.out.println("SIFIR");
		}else if (rakam==1) {
            System.out.println("BİR");
        }else if (rakam==2) {
            System.out.println("İKİ");
        } else if (rakam==3) {
            System.out.println("UC");
        }else if (rakam==4) {
            System.out.println("DORT");
        }else if (rakam==5) {
            System.out.println("BES");
        }else if (rakam==6) {
            System.out.println("ALTI");
        }else if (rakam==7) {
            System.out.println("YEDI");
        }else if (rakam==8) {
            System.out.println("SEKİZ");
        }else if (rakam==9) {
            System.out.println("DOKUZ");
        }else {
            System.out.println("Lutfen bir rakam gir adamım!");
        }

		//soruyu switch ile yapalim
		
		switch(rakam) {
		case 0:
			System.out.println("Sifir");
			break;
		case 1: // rakam==1 direk bunu anliyor
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("Uc");
			break;
		case 4:
			System.out.println("Dort");
			break;
		case 5:	
			System.out.println("Bes");
			break;
		case 6:
			System.out.println("Alti");
			break;
		case 7:
			System.out.println("Yedi");
			break;
		case 8:
			System.out.println("Sekiz");
			break;
		case 9:
			System.out.println("Dokuz");
			break;
		default : // else gibi geriye kalan hersey icin gecerli
			System.out.println("Lutfen gecerli bir rakam giriniz");
			
			
			scan.close();
		}
		
	
				
		

	}

}
