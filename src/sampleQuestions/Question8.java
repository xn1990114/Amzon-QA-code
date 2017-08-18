package sampleQuestions;

import java.util.Arrays;

/*
 * 10- Print the first and final occurrence of a number in a sorted array of integers.
e.g. int[] list = {1,2,3,4,5,5,7,8}
 */
public class Question8 {
	public int[] findOccur(int[] array, int target){
		int[] result=new int[2];
		Arrays.fill(result, -1);
		binarySearch(array,result,0,array.length-1,true,true,target);
		return result;
	}
	public void binarySearch(int[] array,int[] result,int start,int end,boolean findFirst,boolean findLast,int target){
		if(!findFirst&&!findLast){
			return;
		}
		if(start>end){
			return;
		}
		int mid=start+(end-start)/2;
		if(array[mid]==target){
			if(findFirst){
				if(mid-1<0||array[mid-1]!=target){
					result[0]=mid;
				}
				else{
					binarySearch(array,result,start,mid-1,true,false,target);
				}
			}
			if(findLast){
				if(mid+1>=array.length||array[mid+1]!=target){
					result[1]=mid;
				}
				else{
					binarySearch(array,result,mid+1,end,false,true,target);
				}
			}
		}
		else if(array[mid]>target){
			binarySearch(array,result,start,mid-1,true,true,target);
		}
		else{
			binarySearch(array,result,mid+1,end,true,true,target);
		}
	}
}
