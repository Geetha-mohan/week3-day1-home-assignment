package week3.day1.homeassignments.string;

import java.lang.reflect.Array;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddIndexToUppercase odd = new OddIndexToUppercase();
		System.out.println(odd.changeToUpper("changeme"));

	}
	
	public StringBuilder changeToUpper(String str) {
		char[] charArr = str.toCharArray();
		System.out.println(charArr);
		char[] c= new char[charArr.length];
		for(int i=0;i<charArr.length;i++) {
			if(i%2!=0) 
				c[i] = Character.toUpperCase(charArr[i]);				
			else
				c[i]=charArr[i];
		}
		StringBuilder changedStr = new StringBuilder();
		for(char i:c) {
			changedStr.append(i);
		}
		return changedStr;
		
	}

}
