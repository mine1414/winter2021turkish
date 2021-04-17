package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		//ststic olarak tanimlanmis bir veriable veye method 
		//baska class'dan classIsmi.methodIsmi seklinde cagirilabilir
		
		Interface02.deneme2();
		
		//Default keyword'u ile olusturdugumuz method ise 
		//obje uzerinden cagirilabilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
		

	}

}
