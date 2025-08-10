public class p_2_11 {
    public static void main(String[] args) {
   

        int n = Integer.parseInt(args[0]);

        System.out.println("Prime numbers between 1 and " + n + " using for loop:");
        forLoopPrime(n);

        System.out.println("\nPrime numbers between 1 and " + n + " using while loop:");
        whileLoopPrime(n);

        System.out.println("\nPrime numbers between 1 and " + n + " using do-while loop:");
        doWhileLoopPrime(n);
    }

    // Check prime helper method
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // (a) For loop
    public static void forLoopPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // (b) While loop
    public static void whileLoopPrime(int n) {
        int i = 2;
        while (i <= n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    // (c) Do-while loop
    public static void doWhileLoopPrime(int n) {
        int i = 2;
        if (n >= 2) {
            do {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= n);
        }
    }
}
