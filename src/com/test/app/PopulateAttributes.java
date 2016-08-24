package com.test.app;

import java.util.ArrayList;

public class PopulateAttributes {
	
	public String str1= "";
	public String str2= "";
	public String str3= "";
	public String str4= "";
	public String str5= "";
	public String str6= "";
	
	
	
	
  public static void main(String args[]){
	  DefineAttributes obj = new DefineAttributes();
	  obj.generateValues();
	  ArrayList<String> baseList = obj.list;
	  for(String str : baseList){
		  System.out.println( ""+str);
	  }
	  
  }

}
