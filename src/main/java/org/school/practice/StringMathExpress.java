package org.school.practice;

import java.util.ArrayList;
import java.util.List;

public class StringMathExpress {

	public static void mainn(String[] args) {
		
		String expression = "1 + 5 - 4 * 2 + 3 - 4 - 1 + 3";
		String arr[] = expression.split(" ");
		double result = calculate(arr);
		System.out.println("Expression answer: "+result);
	}
	
	
	public static double calculate(String[] arr) {
		
		double result = 0.0;
		
		List<Integer> ob = new ArrayList<>();
		List<Integer> cb = new ArrayList<>();
		
		boolean isBracketPresent = false;
		 
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i].charAt(0)=='(') {
				isBracketPresent = true;
				ob.add(i);
			}
			else if(arr[i].charAt(0)==')') {
				cb.add(i);
			}
		}
		
		if(isBracketPresent) {
			for(int i=ob.size()-1, j=0 ; i>=0 ; i--, j++) {
				result = operate(arr, ob.get(i), cb.get(j));
			}
		}
		
		List<String> newExpres = new ArrayList<>();
		
		
		boolean resultOfBrakcetInsert = false;
		
		String[] arr2;
		
		if(isBracketPresent) {
			
			int obl = ob.get(0);
			int cbl = cb.get(0);
			
			for(int i=0 ; i<arr.length ; i++) {
			
				if(!(obl<=i && cbl>=i)) {
					newExpres.add(arr[i]);
				}
				else if(!resultOfBrakcetInsert) {
					resultOfBrakcetInsert = true;
					newExpres.add(result+"");
				}
			}
			
			arr2 = new String[newExpres.size()];
			arr2 = newExpres.toArray(arr2);
		}
		else {
			arr2 = arr;
		}
		
		//System.out.println("arr2: "+Arrays.toString(arr2));
		
		for(String i : arr2)
			;//System.out.print(i+"   ");
		//System.out.println(newExpres);
		
		result = operate(arr2, -1, arr2.length);
		return result;
	}
	
	public static double operate(String[] a, int start, int end) {
		
		double result = 0.0;
		
		if(a[start+1].charAt(0)=='-') {
			result = Double.valueOf(a[start+1]+a[start+2]);
			start = start + 3;
		}
		else {
			result = Double.valueOf(a[start+1]);
			start = start + 2;
		}
		
		//System.out.println("result: "+result);
		
		for(int i=start ; i<end ; i+=2) {
			//System.out.print(a[i]+"   ");
			
			double tempResult = Double.valueOf(a[i+1]);
			boolean isHighPriorityOparetor = false;
			
			if(( (i+2)<a.length) && ( a[i+2].charAt(0)=='*' || a[i+2].charAt(0)=='/')) {
				tempResult = cal(a[i+2].charAt(0), Double.valueOf(a[i+1+2]), Double.valueOf(a[i+1]) );
				isHighPriorityOparetor = true;
			}
			result = cal(a[i].charAt(0), tempResult, result);
			if(isHighPriorityOparetor) {
				i += 2;
			}
		}
		
		//System.out.println("\nsum: "+result);
		
		return result;
	}
	
	public static double cal(char c, Double num, double val) {
		
		switch(c) {
			case '+':
					val = val + num;
					break;
			case '-':
					val = val - num;
					break;
			case '*':
					val = val * num;
					break;
			case '/':
					val = val / num;
					break;			
		}
		return val;
	}
}
