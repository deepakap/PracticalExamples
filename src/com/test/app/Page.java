package com.test.app;

import java.util.ArrayList;

public class Page {
	
	public static void main(String[] args) {
		//System.out.println( " printing "+new ModifierExamples().number);
		//System.out.println( " String is "+new ModifierExamples().str);
		ModifierExamples obj = new ModifierExamples();
		obj.setVariables();
		obj.printVariables();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("friday");
		list.add("monday");
		list.add("thursday");
		list.add("wednesday");
		
		Boolean flag = new Page().checkSortStatus(list);
		System.out.println(  " is Sorted ? "+flag);
		
	}
	
	
	public Boolean checkSortStatus(ArrayList<String> list){
		
		if(list == null || list.isEmpty())
	        return false;

	    if(list.size() == 1)  
	        return true;

	    for(int i=1; i<list.size();i++)
	    {
	        if(list.get(i).compareTo(list.get(i-1)) < 0 )
	            return false;
	    }

	    return true;  
		
	}
	
	
	
	
}
