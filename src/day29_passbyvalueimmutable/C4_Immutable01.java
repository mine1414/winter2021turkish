package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
         String isim="Ali";
         isim.concat("Can");
         System.out.println(isim);//Ali
         System.out.println(isim.concat("Can"));//bu satira ozel  Alican
         System.out.println(isim);//Ali
         //stringlerde method ile yaptigimiz degisiklikler kalici olmaz
         //cunku java string classini immutable yapmistir
         
         List<String> isimList=new ArrayList<>(); 
         System.out.println(isimList);//[]
         isimList.add("Ali");
         isimList.add("Can");
         System.out.println(isimList);//[Ali, Can]
         isimList.remove(1);
         System.out.println(isimList);//[Ali]
         //listlerde method ile yaptigimiz degisiklikler kalici olarak liste eklenir
         //cunku list mutable'dir
	}

}
