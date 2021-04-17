package day36_Inheritance;

public class UstaBasi extends Isci {
	
	public String bolum="Takimhane";
    public int sorOldIscisay=20;
    
	public static void main(String[] args) {
		//Objeyi torun classindan olusturunca 3 class'a da ulasabiliyoruz
		
		
		UstaBasi ub1=new UstaBasi();
		System.out.println(ub1.bolum);//takimhane
		System.out.println(ub1.sorOldIscisay);//20
		System.out.println(ub1.saatUcreti);//10
		System.out.println(ub1.isim);//Mehmet
		
		//List<String> list=new ArrayList<>();
		Isci ub2=new UstaBasi();
		//Extends ile birbirine bagli olan class'larda IS-A relation olan
		//Data turleri istege bagli olarak kullanilabilir
		//Daha genis data turu yazmanin avantaji:
		//kapsamin daha genis olmasi
		//Daha genis data turu yazmanin dezavantaji:
		//Data turu olarak sectigimiz class ve parent'larina ait datalara ulasabiliriz
		
		System.out.println(ub2.departman);//Isci
		System.out.println(ub2.izindeMi);//Personel
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id);//Personel
		
		
		
		
		

	}

}
 