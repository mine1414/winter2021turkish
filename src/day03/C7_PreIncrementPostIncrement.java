package day03;

public class C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num=20;
		num++;
		System.out.println(num); // 21
		System.out.println(num++); // 21 Once yazdirir sonra arttiriyor POST INCREMENT sonradan arttirma
		System.out.println(num); // 22
		
		System.out.println(++num); // 23 PRE INCREMENT onceden arttirma
		System.out.println(num);  // 23
	}

}
