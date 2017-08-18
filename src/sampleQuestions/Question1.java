package sampleQuestions;


//1- Write a script to count the number of occurrences of the given element in an array.
public class Question1 {
	public int countOccurrence(int[] array,int target){
		if(array==null){
			return 0;
		}
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==target){
				count++;
			}
		}
		return count;
	}
}
