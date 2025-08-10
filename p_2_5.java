public class p_2_5 {
    public static void main(String[] args) {
        
        //Write a Java program to find the sum of digits of a number using a command line argument. Example: 123 → 1+2+3 = 6

        int num = Integer.parseInt(args[0]);
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;       
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
