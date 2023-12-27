public class Divisors {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i =0;
        for (i=1; i<num+1; i++) {
            if (num%i == 0){
            System.out.println(i);    
            }
        }
    }
}