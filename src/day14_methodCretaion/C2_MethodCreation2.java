package day14_methodCretaion;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
	// Public: acses modifier
	//void: return type dondurdugu bir sonuc yok sadece YAZDIRIR
	// main: isim
	//(): icindeki parametredir;burada data tipi string
	// parametrenin ismi: args
    //{}: body 
		//bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
		//bir methodu cagirmak ise method adinin ve parametrelere uygun argumentleri yazmaliyiz
		
		ortalama(85.2,90.3);//method call
		
	} // main method sonu
	
	// bir method olusturmak istedigimizde classin icinde ama main methodun disinda bir alanda olusturmaliyiz
	// genel kullanim methodlar main methoddan sonra olur
	
	public static void ortalama(double sayi1,double sayi2) {
		System.out.println("Girdiginiz iki sayinin ortalamasi: " + (sayi1+sayi2)/2);
		// bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		//olusturulan method main method icinden cagirilinca calisir
		
	}
	
	
	
	
} // class sonu
