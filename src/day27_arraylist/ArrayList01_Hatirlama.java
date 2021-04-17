package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01_Hatirlama {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);
		
		System.out.println(list.size());//4
		
		System.out.println(list.remove(1));// indexi 1 olan can'i silip sildigi elemani dondurur
	    System.out.println(list);
	    
	    System.out.println(list.remove("Ayse")); //ayseyi silecek bize true donecek
	    System.out.println(list);
	    
	    System.out.println( list.remove("Mehmet"));
	    System.out.println(list);
	    
	    list.remove(1);
	    list.remove("Ali");
	    System.out.println(list);

	}

}
