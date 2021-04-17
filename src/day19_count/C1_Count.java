package day19_count;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve harf isteyin 
		//while loop kullanarak cumlede istene harf kac kez kullanilmis bulunuz
		// program Case sensitive olsun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istediginiz harfi giriniz");
		String harf=scan.next().substring(0, 1); //charla ile de yapilir di
		
	    int count=0;
		int index=0;
		
		while (index<cumle.length()) {
			if(cumle.substring(index, index+1).equals(harf)) {
				count++;
				}
			    index++;
		}
          System.out.println("cumlede "+ harf +" harfi " + count+ " defa kullanilmis");         
	   
	
	
		
		scan.close();
	}

}
