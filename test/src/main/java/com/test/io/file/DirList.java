package com.test.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList{
	
	private String hello = "hello world";
	public DirList() {
		show(filter("\\.(.)*"));
	}
	private FilenameFilter filter(String regex) {
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			String hello1 = hello;
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	} 
	
	public void show(FilenameFilter filter) {
		File file = new File(".");
		String[] string = file.list(filter);
		for (String str : string) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		DirList dirList = new DirList();
	}
}