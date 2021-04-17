package day41_errors_garbagecollector;

import java.util.Iterator;

public class Errors {

	public static void main(String[] args) {

		System.out.println(20 / 0);// RTE degil RunTimeException

		// String str="asd; //CTE 'dir...Cunku cift tirnagi tamamlamadikca kod calismaz
		// Bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir
		
		//Java'da Error dendiginde onune gecilemeyen kod ile cozulemeyen 
		//sistemden kaynakli buyuk hatalar kastedilir
		
		//Error'lar unchecked'dir ve java bunlari ongoremez ancak 
		//gerceklestiginde kodun calismasi durdurulur
		
		String str="";
		for (int i = 0; i < 1000000; i++) {
			str+=i;
			}
			
		}

	}


