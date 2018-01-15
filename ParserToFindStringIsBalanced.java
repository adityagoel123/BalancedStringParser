package com.aditya.mlabs.tester;

import java.util.ArrayList;
import java.util.List;

class Parser {

	static List<String> possblStrings = new ArrayList<String>();
	
	public boolean isBalanced(String next) {
		if(possblStrings.isEmpty()){
			fillMap();
		}
		boolean whetherBalanced = false;
		
		for(int i=0; i<possblStrings.size(); i++){
			if(next.contains(possblStrings.get(i))){
				next = next.replace(possblStrings.get(i), "");
				i=-1;
			}
		}
		
		if(next.isEmpty()){
			whetherBalanced = true;
		} else {
			whetherBalanced = false;
		}
		return whetherBalanced;
	}
	
	public void fillMap(){
		possblStrings.add("()");
		possblStrings.add("{}");
		possblStrings.add("[]");
		possblStrings.add("<>");
	}
	
}



class ParserToFindStringIsBalanced {

	public static void main(String args[]){
		
		Parser parser = new Parser();
		/*Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}*/
		
		parser.isBalanced("({()})");
		
		
	}

	
}

