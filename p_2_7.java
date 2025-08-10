public class p_2_7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("n is command line argument");
            return;
        }

        int n = Integer.parseInt(args[0]); // number of terms
        double sum = 0.0;

        System.out.print("Harmonic series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
            sum += 1.0 / i;
        }

        System.out.println();
        System.out.println("Sum of series up to " + n + " terms: " + sum);
    }
}
