package com.JavaCollectionList.gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;

import com.google.gson.*;
//import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {		
		
		Gson gson = new Gson();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("product1.json"));
			Result result = gson.fromJson(br, Result.class);
			
			if(result != null) {
				System.out.println("ID" + " | " + " Nama Produk" + " | " + "    Jenis Product    " + " | " + "Status" + " | " + " Stok " + " | " + " Harga " + " | ");
				for(Product p : result.getProduct()) {
					System.out.println(p.getId() + "  |     " + p.getProductName() + "     |   " + p.getProductType() + "           | " + p.getInfo().getStatus() + "    |    " + p.getInfo().getStock() + " | " + p.getInfo().getPrice() +  " | ");
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
}



