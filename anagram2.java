package javaarraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class anagram2 {
	static boolean isAnagram(String a, String b) {
        String C=Anagramsss(a);
		String D=Anagramsss(b);
		if (C.equalsIgnoreCase(D)){
			return true;}
		else{
			return false;
    }}
    public static String Anagramsss(String c){
		String a=c.toLowerCase();
		char[] conStringToCharArray= a.toCharArray();
		Arrays.sort(conStringToCharArray);
		String conCharToString=String.valueOf(conStringToCharArray);
		return conCharToString;
	}
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}}
