package sampleQuestions;

/*4- Given are two ordered lists of size 7 and 3. 
 * The first list has three vacant spots in the end. 
 * Merge them in a sorted manner with minimum no. of steps.*/
public class Question3 {
	public void sort(int[] a7, int[] a3) throws Exception{
		if(a7==null||a3==null||a7.length!=7||a3.length!=3){
			throw new Exception("invalid input");
		}
		int k = a7.length - 1;
		int i = a7.length - a3.length - 1;
		int j = a3.length - 1;
		while (i >= 0 && j >= 0) {
			if (a7[i] > a3[j]) {
				a7[k] = a7[i];
				i--;
				k--;
			} else {
				a7[k] = a3[j];
				j--;
				k--;
			}
		}
		while (i >= 0) {
			a7[k] = a7[i];
			i--;
			k--;
		}
		while (j >= 0) {
			a7[k] = a3[j];
			j--;
			k--;
		}
		for(int index=0;index<a7.length;index++){
			System.out.print(a7[index]+" ");
		}
		System.out.println();
	}
	
}
