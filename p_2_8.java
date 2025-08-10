public class p_2_8 {
    public static void main(String[] args) {
     
        //give one imput
        
        int num = Integer.parseInt(args[0]);

        System.out.println("Factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
