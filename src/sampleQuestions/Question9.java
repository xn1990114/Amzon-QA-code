package sampleQuestions;

import java.util.HashSet;

/*
 * 11- Write a program to print the first non-repeated char in a string. 
 * e.g. A string “Is it your first company” returns ‘u’.
 */
public class Question9 {
	public char findNonRepeat(String str){
		HashSet<Character> single=new HashSet<Character>();
		HashSet<Character> duplicate=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(duplicate.contains(ch)){
				continue;
			}
			else{
				if(single.contains(ch)){
					single.remove(ch);
					duplicate.add(ch);
				}
				else{
					single.add(ch);
				}
			}
		}
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(single.contains(ch)){
				return ch;
			}
		}
		return 0;
	}
}
