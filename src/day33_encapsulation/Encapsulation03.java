package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		//Encapsulation02 class'indaki class member'a ulasmaya calisalim
		
		Encapsulation02 obj1=new Encapsulation02();
		Encapsulation02 obj2=new Encapsulation02();
		
		//Biz erisim yetkisini ikiye ayiriyoruz
		//1-okuyabilme get() 
		//2-degistirip kullanabilme set()
	
		System.out.println(	obj1.sayi); //public olan direk getririlip kullanildi
		obj1.sayi=25;
		System.out.println(obj1);//25
		System.out.println(obj2);//100
		
		System.out.println(obj1.getOkulIsmi());//Yildiz Koleji :Herkes okur ama degistiremez private==>public get()
		//obj1.getOkulIsmi()="Mehmet Koleji"; //get methodu sadece okur degistiremez olmuyor bu nedenle
		
		obj1.setHesapNo(546789);// ilk atadigim degeri kimse gormesin ama istedigini yazabilir private==>public set()
		                        //yazdirmak icin methodun oldugu yere syso yaptik 
		//System.out.println(obj1.setHesapNo(12345679)); set methodu okumaya izin vermez
		
		
		
		

	}

}
