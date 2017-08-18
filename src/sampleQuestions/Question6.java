package sampleQuestions;

/*7- Write code to count the duplicate characters in a given string.
 */
public class Question6 {
	public int countDuplicate(String str){
		int[] count=new int[256];
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			count[(int)ch]++;
		}
		int result=0;
		for(int i=0;i<256;i++){
			if(count[i]>1){
				result++;
			}
		}
		return result;
	}
}
