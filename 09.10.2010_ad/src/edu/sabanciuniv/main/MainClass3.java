package edu.sabanciuniv.main;
import java.util.Arrays;


public class MainClass3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] names = new String[]{"ali","veli","durali","haydar"};
		
		Arrays.sort(names);
		
		for (String name : names) {
			
			System.out.println(name);
		}
	}

}
