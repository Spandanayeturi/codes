package com.training.capgemini;
import java.util.*;

public class Firstcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 
		 int x=0;
		 int z=87;
		 boolean correct=false;
		 while(!correct){
			 
			 x++;
			int y=s.nextInt();
			
		      if(z==y) {
	
		      
		    	 System.out.println("Congrats!!you guessed it right in" + x+ "attempts");
		    	 correct=true;
		      }
		      else {
		    	  System.out.println("Not really!!try again");
		      }
		
		
		
			

	}

	}}
