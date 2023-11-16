package org.seleniumbatch0004;

public class LargestNumber {
	
	/*Algotrithm
	  Array define value set 
2. Take the length and print individual 
3. Take max() as variable and compare with individual 
4. while comparing which one is greatest then i have to print the value
	 * 
	 * 
	 */
  public static void main(String[] args) {  
  	  
      int [] var = new int [] {30,115,07};
      int max = var [0];
      for (int i=0;i<var.length;i++) {
    	  
    	  if(var[i]>max)
    		  max=var[i];
    	  
    	 
      
      }
      System.out.println("Largest element in a array:" + " "+ max);
  }
  
  
}
