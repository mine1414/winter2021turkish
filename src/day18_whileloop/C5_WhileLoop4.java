package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		//  Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari 
		//ve toplam kac tane  olduklarini ekranda yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();// 100 girse neye bolecegimiz icin bolen veriable olustur
		int bolen=1;
		int count=0; //sayac
		
		while (bolen<=sayi) {
			if(sayi%bolen==0) {
				count++; //bolen bulununca 1 arttiriyor
				System.out.println(bolen + " ");
			}
			bolen++;
		}
		System.out.print(sayi+ " sayisinin bolenleri: " +count + " adettir");
		
		
		System.out.println(" ");
		//bolenleri su sekilde yazdirin
		//1-1
		//2-2
		//3-4
		
		bolen=1;
	    count=0; //sayac
		
		while (bolen<=sayi) {
			if(sayi%bolen==0) {
				count++; //bolen bulununca 1 arttiriyor
				System.out.println(count + "- " + bolen);
			}
			bolen++;
		}
		
		
	}
	

}
