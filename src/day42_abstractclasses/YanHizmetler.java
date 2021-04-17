package day42_abstractclasses;

public abstract class YanHizmetler extends Personel{
	
	//abstract bir class'in absract child'ini olusturursak tum abstract methodlari 
	//implement etmek zorunda olmayiz
	//Java bilir ki bu child son class degil mutlaka bu child'in 
	//concrete child class'i olacak
	//Baba da parenttaki method override yapilmissa child'da olmasa da olur
	
	public static void main(String[] args) {
		
		//YanHizmetler obj1=new YanHizmetler();
		//abstract bir class'dan obje uretilemez,somutlastirilamaz(instantiate)
		//abstract class private ve final olamaz
	}

}
