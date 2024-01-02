import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args)/* {
		int t = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		int boys = 0;
	    int girl = 0;
	    int kid2 = 0;
	    int kid3 = 0;
	    int kid4 = 0;
	    int sum = 0;
	    for(int i = 0; i<t; i++){
        while (boys == 0 || girl == 0){
		Random generator = new Random(seed); 
		double rnd = generator.nextDouble();
		if (rnd <= 0.5){
        boys ++;
		}
		else {
		girl ++; 
	    }
	    if (girl >=1 && boys >= 1){
	    sum = boys + girl;	
	    } 
	}
	   if (sum == 2){
       kid2++;
	   }	
	   if (sum == 3){
       kid3++;
	   }	
	   if (sum >= 4){
       kid4++;
	 }
	   boys = 0;
	   girl = 0;
   }
       double ageSum = kid2*2 + kid3*3 + kid4*4;
	   double avr = ageSum/t;

	   System.out.println("Average: " + avr + " children to get at least one of each gender." );
	   System.out.println("Number of families with 2 children: " + kid2 );
	   System.out.println("Number of families with 3 children: " + kid3 );
	   System.out.println("Number of families with 4 or more children: " + kid4 );	

	   if (kid2 > kid3 && kid2 > kid4) {
       System.out.println("The most common number of children is " + 2 + "." );

	   }else if (kid3 > kid2 && kid3 > kid4) {
	   System.out.println("The most common number of children is " + 3 + "." );

	   }else 
	   System.out.println("The most common number of children is 4 or more.");
	
		    
	}
}
*/
	{
	    
	    int t = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		Random generator = new Random(seed);
	    int boys = 0;
	    int girl = 0;
	    int kid2 = 0;
	    int kid3 = 0;
	    int kid4 = 0;
	    int sum = 0;
	    for(int i = 0; i<t; i++){
         while (boys == 0 || girl == 0){
		  double num = generator.nextDouble();
		  if (num <= 0.5){
           boys ++;
		  } else {
		    girl ++; 
	      }
	      if (girl >=1 && boys >= 1){
	       sum = boys + girl;	
	      } 
	      boys = 0;
	        girl = 0;
	   }
	      if (sum == 2){
             kid2++;
	       }	
	       if (sum == 3){
            kid3++;
	       }	
	       if (sum >= 4){
            kid4++;
	       }
          }
            double ageSum = kid2*2 + kid3*3 + kid4*4;
	        double avr = ageSum/t;

	        System.out.println("Average: " + avr + " children to get at least one of each gender." );
	        System.out.println("Number of families with 2 children: " + kid2);
	        System.out.println("Number of families with 3 children: " + kid3);
	        System.out.println("Number of families with 4 or more children: " + kid4);	

	        if (kid2 > kid3 && kid2 > kid4) {
             System.out.println("The most common number of children is " + 2 + ".");

	        } else if (kid3 > kid2 && kid3 > kid4) {
	           System.out.println("The most common number of children is " + 3 + ".");

	        } else 
	           System.out.println("The most common number of children is 4 or more.");
           }
         }