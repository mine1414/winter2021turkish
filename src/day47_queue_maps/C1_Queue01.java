package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//Queue bir interface'dir dolayisiyla obje uretemeyiz
		//Child class'i olan PriorityQueue ve LinkedList concturctor 
		Queue<String> k1=new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1);//[A, C, M, D]
		//Queue(kuyruk) yapisi geregi insertion order'e gore siralama yapmasi beklenir.
		//Ancak constructor olarak PriorityQueue sectigimiz icin java tarafindan belirlenen
		//priority'e gore siralama yapar

		//Bizde istersek priority kuralini tanimlayabiliriz.O zaman bizim istedigimize gore siralar
		Queue<String> k2=new LinkedList<>();
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		System.out.println(k2);//[D, C, M, A]
		//Ayn elemanlarla fakat LinkedList constructor'i kullanarak olusturdugumuz 
		//queue ise bekelenenlere uygun olarak ekleme sirasina gore yazdirir
		
		//Queue'nin yapisi geregi FIFO(first in first out)kurali gecerlidir.
		k2.offer("Z");
		System.out.println(k2);//[D, C, M, A, Z] (Add gibi) en sona eleman ekler
		
		System.out.println(k2.peek());//D Silmeden ilk elemani bize dondurur
		System.out.println(k2);
		
		System.out.println(k2.remove());//D sildigini verir
		System.out.println(k2);//[C, M, A, Z] en bastakini siler
		
		System.out.println(k2.remove("A"));//true
		System.out.println(k2);//[C, M, Z]
		
		System.out.println(k2.poll());//C Ilk elemani siler
		System.out.println(k2);//[M, Z]
		
		System.out.println(k2.element());//M
		System.out.println(k2);//[M, Z]
		
		k2.remove();
		k2.remove();
		System.out.println(k2.isEmpty());//true
		k2.poll();//poll() bos bir queue'de kullanilirsa excep. vermez null dondurur
		System.out.println(k2);
		//k2.remove();//bos bir queue den remove () ile eleman silmek istersek exception verir
		//System.out.println(k2.element());//queue bossa exc firlatir
		
		
	}
	

}
