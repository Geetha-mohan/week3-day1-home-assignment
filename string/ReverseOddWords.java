package week3.day1.homeassignments.string;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] splitTest = test.split(" ");
		char[] oddWords = null;
		//char[] reverse = null;
		
		for(int i=0;i<splitTest.length;i++) {
			if(i%2==0){
				System.out.print(" "+splitTest[i]+" ");
			}
			else
			 {
				oddWords= splitTest[i].toCharArray();
				for(int j=oddWords.length-1;j>=0;j--) {
					System.out.print(oddWords[j]);}								
			}
		}
		
		

	}

}
