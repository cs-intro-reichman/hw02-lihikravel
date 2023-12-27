
public class Perfect {
	public static void main (String[] args) {
		 int num = Integer.parseInt(args[0]);
		 int i = 0;
		 int num2 =0;
		 for (i=1; i<num ;i++){
          if (num%i == 0){
           num2 = num2 + i;
       }
     }
          if (num == num2){
          	System.out.print(num + " is a perfect number since " + num + " = " + 1);
          	 for (i=2; i<num ;i++){
          if (num%i == 0){
         System.out.print( " + " + i );  
       }
     }
		}
 
		else 
			System.out.println(num + " is not a perfect number");
	}
}
