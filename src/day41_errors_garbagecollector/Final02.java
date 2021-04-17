package day41_errors_garbagecollector;

public class Final02 extends FinalFinallyFinalize {

	public static void main(String[] args) {
	  
		System.out.println(FinalFinallyFinalize.SAYI2); //static veriableye ulasmak icin class ismi nokta 
		
		//static veriable okul ismi gibi herkes icin aynidir
		//FinalFinallyFinalize.SAYI2=40;
		//SAYI2 veriable'i final olarak tanimlandigi icin degistirilemez 
		
		Final02 obj1=new Final02();
		obj1.deneme();
		
}

	@Override
	public void deneme() {
		System.out.println("child class'taki overriding method");
		}
	
	//public final void deneme2() {}
	//	Cannot override the final method from FinalFinallyFinalize
	//Final method override edilemez
	//final class inherit edilemez
	

}
