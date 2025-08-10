public class p_2_9 {
    public static void main(String[] args) {
   

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);

        int max, min;

        // Find maximum using nested if-else
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    max = num1;
                } else {
                    max = num4;
                }
            } else {
                if (num3 > num4) {
                    max = num3;
                } else {
                    max = num4;
                }
            }
        } else {
            if (num2 > num3) {
                if (num2 > num4) {
                    max = num2;
                } else {
                    max = num4;
                }
            } else {
                if (num3 > num4) {
                    max = num3;
                } else {
                    max = num4;
                }
            }
        }

        // Find minimum using nested if-else
        if (num1 < num2) {
            if (num1 < num3) {
                if (num1 < num4) {
                    min = num1;
                } else {
                    min = num4;
                }
            } else {
                if (num3 < num4) {
                    min = num3;
                } else {
                    min = num4;
                }
            }
        } else {
            if (num2 < num3) {
                if (num2 < num4) {
                    min = num2;
                } else {
                    min = num4;
                }
            } else {
                if (num3 < num4) {
                    min = num3;
                } else {
                    min = num4;
                }
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
