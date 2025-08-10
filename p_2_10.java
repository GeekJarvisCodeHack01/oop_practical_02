public class p_2_10 {
    public static void main(String[] args) {
        // Widening (Implicit Casting)
        int intNum = 100;
        float floatNum = intNum; 
        double doubleNum = floatNum; 

        System.out.println("Widening Typecasting:");
        System.out.println("int value: " + intNum);
        System.out.println("float value (from int): " + floatNum);
        System.out.println("double value (from float): " + doubleNum);

        // Narrowing (Explicit Casting)
        double d = 123.456;
        float f = (float) d; 
        int i = (int) f;

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double value: " + d);
        System.out.println("float value (from double): " + f);
        System.out.println("int value (from float): " + i);
    }
}
