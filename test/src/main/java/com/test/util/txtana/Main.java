package com.test.util.txtana;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:/CS_8557_2016_0011.txt"));
			String str;
			double amt = 0;
			while((str = br.readLine())!=null) {
				System.out.println(str.split("\\|")[0] + " " +str.split("\\|")[1]);
				amt+= Double.parseDouble(str.split("\\|")[1]);
			}
			System.out.println(amt);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
