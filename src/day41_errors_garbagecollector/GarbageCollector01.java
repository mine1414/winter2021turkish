package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
			}
		//Bu kod olustugunda kac tane obje olusur
		//1001
		//ilk basta 1 tane olsuturduk
		//sonra her dongude str'a concantination yapilacak
		//ama String class'i immutablr oldugu icin her yeri degeri koymak icin
		//yeni bir String objesi olusturulur ve eski objed'den pointer silinir
		
		//dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje,
		//1000 tane de hic bir pointer'in isaret etmedigi obje heap memory de bulunur
		
		List<Integer> list=new ArrayList<>();
		//Bu satir java'ya yeni bir obje olusturmasini soyluyor
		//Java yeni obje icin yer var mi diye memory kontrol eder ve 
		//memory kritik seviyede ise garbage collector'u devreye sokuyor...
		
		//Garbage collector finalize() methodunu calistirir
		//finalize methodu silinecek objeleri isaretler ve 
		//sonra Garbage collector finalized olan objeleri siler
		//finalized de olmayanlari da sikistirir ve depoda yer acar

	}

}
