package mx.itam.adsi.ejemplo;

import com.google.gson.*;
import java.io.*;
import java.io.IOException;

public class LeeConvierte{
	public static void main(String... argv){
		String csvFile = "/home/monica/adsi/part2/lista.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		try{
			Gson gson = new GsonBuilder().create();
			br = new BufferedReader(new FileReader(csvFile));
			while((line = br.readLine()) != null){
				String[] leo = line.split(cvsSplitBy);
				gson.toJson(new Alguien(leo[0].trim(),Integer.parseInt(leo[1].trim()),leo[2].trim()), System.out);
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
