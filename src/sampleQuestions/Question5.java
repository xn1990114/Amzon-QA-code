package sampleQuestions;

/*6- How to reverse an array in the subset of N? 
 * e.g. Input: [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15].
*/
public class Question5 {
	// subset length is k in the below method
	public void reverseSubSet(int[] array,int k){
		if(array.length==0||k<=1){
			return ;
		}
		k=Math.min(k, array.length);
		int start=0;
		while(start<array.length){
			reverseRange(array,start,start+k-1);
			start=start+k;
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	public void reverseRange(int[] array,int start,int end){
		end=Math.min(end, array.length-1);
		while(start<end){
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}
}
