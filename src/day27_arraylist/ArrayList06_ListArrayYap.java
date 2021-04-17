package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06_ListArrayYap {

	public static void main(String[] args) {
		// Verilen listeyi nasil array'e ceviririz
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Veli");
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));

	}

}
