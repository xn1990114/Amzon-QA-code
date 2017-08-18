package test;

import static org.junit.Assert.*;

import java.util.Random;

import hashMap.MyHashMap;
import sampleQuestions.Question1;
import sampleQuestions.Question10;
import sampleQuestions.Question2;
import sampleQuestions.Question3;
import sampleQuestions.Question4;
import sampleQuestions.Question5;
import sampleQuestions.Question6;
import sampleQuestions.Question7;
import sampleQuestions.Question8;
import sampleQuestions.Question9;

public class Test {

	@org.junit.Test
	public void test() throws Exception {
		Question1 q1 = new Question1();
		int[] array1 = { 1, 2, 32, 4, 214, 5, 3, 151, 41, 5, 532, 5, 23, 5 };
		int target = 5;
		assertTrue(q1.countOccurrence(array1, target) == 4);

		Question2 q2 = new Question2();
		int[] array2 = new int[0];
		int[] array3 = { 0, 0, 0 };
		int[] array4 = { 2, 4, 0, 1, 2, 4, 0, 7, 6 };
		q2.moveZero(array2);
		q2.moveZero(array3);
		q2.moveZero(array4);

		Question3 q3 = new Question3();
		int[] a7 = { 3, 3, 5, 6, 0, 0, 0 };
		int[] a3 = { 0, 2, 8 };
		q3.sort(a7, a3);

		Question4 q4 = new Question4();
		String str = "asbsa087&6 das^%$#$#";
		q4.printAllOccur(str);

		Question5 q5 = new Question5();
		int[] array5 = {};
		int[] array6 = { 2, 4, 5, 8, 90, 2, 11, 24 };
		int[] array7 = { 2, 4, 5, 8, 90, 2, 11, 24, 5 };
		q5.reverseSubSet(array5, 0);
		q5.reverseSubSet(array6, 3);
		q5.reverseSubSet(array7, 20);

		Question6 q6 = new Question6();
		String str1 = "";
		assertTrue(q6.countDuplicate(str1) == 0);
		str1 = "SjfbdS$#@!7594ss88&12&";
		assertTrue(q6.countDuplicate(str1) == 4);

		Question7 q7 = new Question7();
		str1 = "";
		assertTrue(q7.checkExpression(str1) == 0);
		str1 = "(3)*2+(5-5*4)";
		assertTrue(q7.checkExpression(str1) == -9);
		str1 = "()()()";
		assertTrue(q7.validParenthesis(str1));

		Question8 q8 = new Question8();
		int[] array8 = { 1, 2, 3, 4, 4, 5, 5, 5, 5, 7, 8, 10, 200 };
		int[] result = q8.findOccur(array8, 4);
		assertTrue(result[0] == 3 && result[1] == 4);
		result = q8.findOccur(array8, 5);
		assertTrue(result[0] == 5 && result[1] == 8);
		result = q8.findOccur(array8, 6);
		assertTrue(result[0] == -1 && result[1] == -1);

		Question9 q9 = new Question9();
		str = "";
		assertTrue(q9.findNonRepeat(str) == 0);
		str = "asdwhihk!ashdwkjfihc";
		assertTrue(q9.findNonRepeat(str) == '!');

		Question10 q10 = new Question10();
		int[][] test = { { 1, 2, 3, 4 }, 
						{ 12, 13, 14, 5 }, 
						{ 11, 16, 15, 6 }, 
						{ 10, 9, 8, 7 } };
		q10.printMatrix(test);
		int[][] test2={{1,2,3,4}};
		q10.printMatrix(test2);
		System.out.println();
		
		MyHashMap<String,String> mhm=new MyHashMap<String,String>();
		mhm.put("aas", "Nan");
		mhm.put("22f", "Xiao");
		assertTrue(mhm.get("aas").equals("Nan"));
		assertTrue(mhm.size()==2);
		mhm.remove("asd");
		assertTrue(mhm.size()==2);
		mhm.remove("aas");
		assertTrue(mhm.size()==1);
		assertTrue(mhm.get("aas")==null);
	}

}
