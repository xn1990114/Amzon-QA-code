package sampleQuestions;

import java.util.Stack;

/*
 * 9- How to find if a given arithmetic expression is a valid one?
 */
public class Question7 {
	public int checkExpression(String str){
		str.replace(" ", "");
		Stack<String> stack=new Stack<String>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				stack.push("(");
			}
			else if(str.charAt(i)==')'){
				while(!stack.isEmpty()){
					int a2=Integer.parseInt(stack.pop());
					String operator=stack.pop();
					if(operator.equals("(")){
						stack.push(String.valueOf(a2));
						break;
					}
					int a1=Integer.parseInt(stack.pop());
					if(!stack.isEmpty()&&stack.peek().equals("-")){
						a1=-a1;
						stack.pop();
						stack.push("+");
					}
					int result=cal(a1,a2,operator);
					stack.push(String.valueOf(result));
				}
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				StringBuilder sb=new StringBuilder();
				sb.append(str.charAt(i));
				while(i+1<str.length()&&str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'){
					sb.append(str.charAt(i+1));
					i++;
				}
				if(!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/"))){
					String operator=stack.pop();
					int a2=Integer.parseInt(sb.toString());
					int a1=Integer.parseInt(stack.pop());
					if(!stack.isEmpty()&&stack.peek().equals("-")){
						a1=-a1;
						stack.pop();
						stack.push("+");
					}
					int result=cal(a1,a2,operator);
					stack.push(String.valueOf(result));
				}
				else{
					stack.push(sb.toString());
				}
			}
			else {
				stack.push(str.charAt(i)+"");
			}
		}
		int result=0;
		while(!stack.isEmpty()){
			int nextNum=Integer.parseInt(String.valueOf(stack.pop()));
			if(stack.isEmpty()){
				result=result+nextNum;
				break;
			}
			String operator=stack.pop();
			if(operator.equals("-")){
				result=result-nextNum;
			}
			else{
				result=result+nextNum;
			}
		}
		return result;
	}
	public int cal(int a1,int a2,String operator){
		if(operator.equals("+")){
			return a1+a2;
		}
		else if(operator.equals("-")){
			return a1-a2;
		}
		else if(operator.equals("*")){
			return a1*a2;
		}
		return a1/a2;
	}
	
	public boolean validParenthesis(String str){
		// left +1, right -1
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='('||ch=='['||ch=='{'){
				stack.push(ch);
			}
			else if(ch==')'){
				char temp=stack.pop();
				if(temp!='('){
					return false;
				}
			}
			else if(ch==']'){
				char temp=stack.pop();
				if(temp!='['){
					return false;
				}
			}
			else if(ch=='}'){
				char temp=stack.pop();
				if(temp!='{'){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
