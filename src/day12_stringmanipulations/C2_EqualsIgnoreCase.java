package day12_stringmanipulations;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() (parantez bize method oldugunu gosterir) method'u
		//karsilastirdigi Stringlere case sensitive(buyuk kucuk harf duyarliligi) 
		//olmaksizin Stringler ayni ise true, ayni degilse false doner
		
		String str1="Ali Can";
		String str2="ali CAN";
		String str3="Ali Can "; // sonunda bosluk var
		
        System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
		
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); // false
		
		
	}

}
