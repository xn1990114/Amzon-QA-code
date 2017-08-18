package sampleQuestions;

/*5- Write a script to print the no. of occurrences of 
 * a given character or all letters in a string.
*/
public class Question4 {
	public void printAllOccur(String str){
		int[] count=new int[256];
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++){
			if(count[i]!=0){
				System.out.print((char)(i-0)+":"+count[i]+'\t');
			}
		}
		System.out.println();
	}
}
