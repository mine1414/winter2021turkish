package day14_methodCretaion;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		
		String str="Java cok guzel";
		//1)Java methodlarin sadece ismine degil,isim + parametrelere bakar
		//sadece parametre sayisi degil parametrelerin data tiplerine bakar
		
		str.endsWith("el"); // Bu methodun gorevi gidip kelimenin son kismini kontrol etmek
	                      // bu methodu kullanmak icin bu methodun kontrol ettikten sonrq 
	                        // bana rapor olark ne getirdigini bilmem lazim (True /false)
	
	//2)Bir method olusturdugumuzdq methodun ne yapacagina
	// ve gorevi yaptiktan sonra ne dondurecegine bastan karar vermeliyiz
	
	//3)Bir method olustururken "str.indexOf(str,fromIndex)" de oldugu gibi 
   // disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
    // deklare etmeliyiz
		
	// methodu calistirmak istedigimizde (methodu cagirmak) parametre olarak declare edilen
	// data tiplerine uygun degerler girmeliyiz
	//girilen bu degerlere ARGUMENT denir
	
	  str.indexOf("va", 1); // 
	
	
	}	

}
