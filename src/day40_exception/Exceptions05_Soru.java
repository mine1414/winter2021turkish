package day40_exception;

public class Exceptions05_Soru {

	public static void main(String[] args) {


		 
		        
		        String s = "";
		        try {
		            s+="t";
		        } catch (Exception e) { //try calsitigi icin catch calismaz
		            s+="c";
		        } finally { //her durumda calisir
		            s+="f";
		        }
		        s+="a";
		        System.out.print(s);
		    


	}

}
