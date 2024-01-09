
public class DamkaBoard {
	public static void main(String[] args) {
		// #feedback: your indentations make the code extremly hard to read...
		
		int num = Integer.parseInt(args[0]);
		for (int i=0; i<num; i++) {
			/* 
   				#feedback: 
       				When i=0 it yield that i % n = 0 for any n
	   			However, it's not a good idea to split same loop for both cases.
			*/ 
			String pattern = " *";
			if (i%2 == 0 ) {
				pattern = "* ";
			}
			for(int j=0; j<num; j++) {
				System.out.print(pattern); 
			}
			System.out.println();
		}
	}
}
