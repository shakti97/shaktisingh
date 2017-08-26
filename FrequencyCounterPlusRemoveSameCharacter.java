package javaarraydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyCounterPlusRemoveSameCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		frequencyCounter(a);
	}
	public static void frequencyCounter(String a){
		int size=a.length();
		ArrayList<Character> unique = new ArrayList<Character>();
		for(int i=0; i< size ; i++) {
			if(!unique.contains(a.charAt(i))) {
				unique.add(a.charAt(i));
			}}
		Collections.sort(unique);
		char[] conStringToCharArray= a.toCharArray();
		Arrays.sort(conStringToCharArray);
		String conCharToString=String.valueOf(conStringToCharArray);
		System.out.println(unique);
		for(int j=0; j<unique.size(); j++) {
			int firstIndex=conCharToString.indexOf(unique.get(j));
			int lastIndex=conCharToString.lastIndexOf(unique.get(j));
			int frequency=(lastIndex-firstIndex) +1 ;
			System.out.println("frequency of" +" "+ unique.get(j) +" "+ "=" + " "+frequency);
		}
		
		
		

	}

}
     