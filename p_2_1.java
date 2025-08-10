public class p_2_1 {
    public static void main(String[] args) {
        
        //print maximum of 3 number...

        if (args.length < 3) {
            System.out.println("enter valid input ");
            return;
        }
        else{
        int num1 =Integer.parseInt(args[0]);
        int num2 =Integer.parseInt(args[1]);
        int num3 =Integer.parseInt(args[2]);
        

        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        System.out.println("Maximum number is: " + max);
    }
    }
}
