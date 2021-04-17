package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
		//null olarak tanimlanmis bir obje ile uygun olmayan bir islem yapmaya 
		//calistiginizda NullPointerException verir(rte'nin ikinci cesidi)
		//Unchecked exception
		
		
		String str1=" ";
		String str2="";
		String str3=null;
		//null bir deger degildir sadece str"'un hicbirseye esit olmadigini soyleyen bir isaretcidir(pointer)
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		//System.out.println(str3.length());//NullPointerException
		System.out.println(str3+ "bos");//nullbos
		System.out.println(str3.concat("bos"));//NullPointerException

	}

}
