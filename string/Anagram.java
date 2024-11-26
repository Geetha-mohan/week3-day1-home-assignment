package week3.day1.homeassignments.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram anagram = new Anagram();
		boolean flag = anagram.checkAnagram("stops","potss");
		if(flag)
			System.out.println("Given strings are anagram");
		else
			System.out.println("Given strings are not anagram");

	}
	
	public boolean checkAnagram(String text1, String text2) {
		//converting string to charArray
		char[] arr1 = text1.toCharArray();
		char[] arr2 = text2.toCharArray();
		
		if(arr1.length==arr2.length) {
			//sorting array
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return false;
		}
		//print sorted array
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//compare sorted array
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;	
		}
		return true;
	}

}
