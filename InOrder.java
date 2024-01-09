
public class InOrder {
	public static void main (String[] args) {
		// #feedback: use better names
		int next =(int) (10* Math.random()) ;
		int last;
		// #feedback: you could do it better with do-while loop and without intializing 'last'
		do {
		    System.out.print(next + " ");
		    last = next;
		    next = (int) (10 * Math.random());
		} while(next > last);	

       
	}
}
