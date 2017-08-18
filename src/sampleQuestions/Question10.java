package sampleQuestions;
/*
 * 12- Write code to print a 2×2 matrix in the spiral format. 
 */
public class Question10 {
	public void printMatrix(int[][] matrix){
		if(matrix==null||matrix.length==0||matrix[0].length==0){
			return;
		}
		int i=0;
		int j=0;
		int left=0;
		int right=matrix[0].length-1;
		int top=0;
		int bottom=matrix.length-1;
		int count=matrix.length*matrix[0].length;
		while(left<=j&&j<=right&&top<=i&&i<=bottom){
			while(j<right){
				System.out.print(matrix[i][j]+" ");
				count--;
				if(count==0){
					return;
				}
				j++;
			}
			top++;
			
			while(i<bottom){
				System.out.print(matrix[i][j]+" ");
				count--;
				if(count==0){
					return;
				}
				i++;
			}
			
			right--;
			while(j>left){
				System.out.print(matrix[i][j]+" ");
				count--;
				if(count==0){
					return;
				}
				j--;
			}
			bottom--;
			while(i>=top){
				System.out.print(matrix[i][j]+" ");
				count--;
				if(count==0){
					return;
				}
				i--;
			}
			left++;
			i=top;
			j=left;
		}
	}
}
