package com.training.capgemini;

public class ProductTest {
	
	public static void main(String args[]) {
		Product prod1= new Product();
		Product prod2= new Product();
		Product prod3= new Product();
		Product prod4= new Product();
		Product prod5= new Product();
		
		prod1.setProductId("1000_A");
		prod2.setProductId("1000_B");
		prod3.setProductId("1000_C");
		prod4.setProductId("1000_D");
		prod5.setProductId("1000_E");
		
		prod1.setProductName("TV");
		prod2.setProductName("Washing Machine");
		prod3.setProductName("Fridge");
		prod4.setProductName("AC");
		prod5.setProductName("Fan");
		
		prod1.setProductPrice(25000);
		prod2.setProductPrice(20000);
		prod3.setProductPrice(18000);
		prod4.setProductPrice(48000);
		prod5.setProductPrice(5000);
		
		prod1.setProductDescrip("BPL 32 inch HD");
		prod2.setProductDescrip("LG 7kg Front Fully Automatic");
		prod3.setProductDescrip("Whirlpool 190L direct cool Single door");
		prod4.setProductDescrip("Blue Star 1.5 Ton 5 Split inverter");
		prod5.setProductDescrip("Crompton Aura Prime Antidust 3 blade");
		
		int [] prodprice=new int[] {prod1.getProductPrice(),prod2.getProductPrice(),prod3.getProductPrice(),prod4.getProductPrice(),prod5.getProductPrice()};
	    if((prodprice[0]>(prodprice[1]))&&(prodprice[0]>(prodprice[2]))&&(prodprice[0]>(prodprice[3]))&&(prodprice[0]>prodprice[4])){
	    	System.out.println("product id: "+prod1.getProductId());
	    	System.out.println("product name: "+prod1.getProductName());
	    	System.out.println("product description: "+prod1.getProductDescrip());
	    	System.out.println("product price: "+prod1.getProductPrice());
	    }
	    else if((prodprice[1]>(prodprice[0]))&&(prodprice[1]>(prodprice[2]))&&(prodprice[1]>(prodprice[3]))&&(prodprice[1]>prodprice[4])){
	    	System.out.println("product id: "+prod2.getProductId());
	    	System.out.println("product name: "+prod2.getProductName());
	    	System.out.println("product description: "+prod2.getProductDescrip());
	    	System.out.println("product price: "+prod2.getProductPrice());}
	    else if((prodprice[2]>(prodprice[1]))&&(prodprice[2]>(prodprice[0]))&&(prodprice[2]>(prodprice[3]))&&(prodprice[2]>prodprice[4])){
	    	System.out.println("product id: "+prod3.getProductId());
	    	System.out.println("product name: "+prod3.getProductName());
	    	System.out.println("product description: "+prod3.getProductDescrip());
	    	System.out.println("product price: "+prod3.getProductPrice());}
	    else if((prodprice[3]>(prodprice[1]))&&(prodprice[3]>(prodprice[2]))&&(prodprice[3]>(prodprice[0]))&&(prodprice[3]>prodprice[4])){
		    	System.out.println("product id: "+prod4.getProductId());
		    	System.out.println("product name: "+prod4.getProductName());
		    	System.out.println("product description: "+prod4.getProductDescrip());
		    	System.out.println("product price: "+prod4.getProductPrice());}
	    else if((prodprice[4]>(prodprice[1]))&&(prodprice[3]>(prodprice[2]))&&(prodprice[3]>(prodprice[0]))&&(prodprice[4]>prodprice[0])){
	    	System.out.println("product id: "+prod5.getProductId());
	    	System.out.println("product name: "+prod5.getProductName());
	    	System.out.println("product description: "+prod5.getProductDescrip());
	    	System.out.println("product price: "+prod5.getProductPrice());}
  
	    	
				
				
			}
			
				 
		
		
		
		
		
		
		
		
	}


