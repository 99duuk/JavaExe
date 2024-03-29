package ch11.string02.ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {
public static void main(String[] args) throws Exception {
	String data = "자바";
	
	byte[] arr1 = data.getBytes();		//utf-8, data.getBytes("UTF-8")
	System.out.println("arr1 : " + Arrays.toString(arr1));
	
	String str1 = new String(arr1);
	System.out.println("str1 : " + str1 );
	
	byte[] arr2 = data.getBytes();
	System.out.println("arr2 : " + Arrays.toString(arr2));
	
	String str2 = new String(arr2, "EUC-KR");
	System.out.println("str2 : " + str2);
}
}
