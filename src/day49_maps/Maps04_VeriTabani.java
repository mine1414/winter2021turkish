package day49_maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps04_VeriTabani {

	public static void main(String[] args) {
		
		String dosyaYolu="C:\\Users\\admin\\Desktop\\VeriTabani.csv";
		
		Map<String,String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);
		

	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {
		
		Map<String,String> eklenecekMap=new HashMap<>();
		


		try {
			BufferedReader br=new BufferedReader(new FileReader(dosyaYolu));//bufferedreader dosya okuma classi-->obje olusturduk
			String satir=br.readLine();//satir okundu satir="isim,Ali"
			
			while(satir!=null) {
				String keyValueArr[]=satir.split(",");//[isim,Ali] arraye cevirdi
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]);//map'e ekledik
				satir=br.readLine();//bir sonraki satiri okur 
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
		return eklenecekMap;
	}

}
