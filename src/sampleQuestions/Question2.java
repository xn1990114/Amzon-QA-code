package sampleQuestions;

//3- Given a number in an array form. Write a program to move all zeros to the end.
public class Question2 {
	public void moveZero(int[] array){
		if(array==null||array.length==0){
			return;
		}
		int zeroIndex=0;
		int nonZeroIndex=0;
		while(zeroIndex<array.length&&array[zeroIndex]!=0){
			zeroIndex++;
		}
		nonZeroIndex=zeroIndex+1;
		while(nonZeroIndex<array.length&&zeroIndex<array.length){
			while(nonZeroIndex<array.length&&array[nonZeroIndex]==0){
				nonZeroIndex++;
			}
			if(nonZeroIndex>=array.length){
				break;
			}
			array[zeroIndex]=array[nonZeroIndex];
			array[nonZeroIndex]=0;
			while(zeroIndex<array.length&&array[zeroIndex]!=0){
				zeroIndex++;
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
