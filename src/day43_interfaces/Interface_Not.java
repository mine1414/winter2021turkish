package day43_interfaces;

public class Interface_Not {
	/*ABSTRACT vs INTERFACE
    1) Abstract :
     1.1 - Class’dir.
     1.2 - Abstract ve concrete method’lar konabilir.
     1.3 - Kismi olarak abstraction saglar.
     1.4 - Birden fazla abstract class’a direk child olunamaz. Coklu inheritance’i desteklemez.
     1.5 - Hiz acisindan avantajlidir
     1.6 - Icindeki tüm nesnelerin “public” olmasi zorunlu degildir.
     1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
     1.8 - Abstract class constructor’a sahiptir 
    
    2) Interface : 
    2.1 - Class degildir.
    2.2 - Sadece abstract method’lar konabilir.
    2.3 - Tam abstraction (soyutluk) saglar
    2.4 - Bir class’dan istediginiz kadar interface’i inherit edebilirsiniz. Coklu inheritance’a uygundur.
    2.5 - Hiz acisindan abstract class’a gore yavastir.
    2.6 - Icindeki tüm nesnelerin “public” olması gerekir.
    2.7 - Method'lar static olamaz
    2.8 - Interface constructor’a sahip degildir
*/
	
	/*
    - Interfaces : interface class degildir, interface interface'dir.
    - Interface, icinde sadece shild class'larin implement etmek zorunda old.
     abstract method'lar olan bir sablon gibidir.(to do list)
    - Bir interface'de tum method'lar abstract ve public'dir(yazilsa da yazilmasa da)
    - Bir interface'de tum variable'lar public,static ve final'dir. (yazilsa da yazilmasa da),
     Bu yuzden variable'lara mutlaka deger atanmlaidir(yoksa CTE verir) .
    - Interface'de constructor yoktur, dolayisiyla instantiate edilemezler yani interface'den obje olusturulamaz.
    - Bir class'i interface'echild yapmak icin implements keyword kullanilir. 
     Birden fazla interface'e implements ile child olunabilir. Bu durumda bir kere implements yazilip,
     sonra tum parent interface'ler virgule ayrilarak art arda yazilir. 
     Ancak interface'e chil yapmak istersek yine extends kullanilir. (InterfaceClass1 extends InterfaceClass2)
    - Hiz acisindan anstract class'a gore yavastir.  
   */
}
