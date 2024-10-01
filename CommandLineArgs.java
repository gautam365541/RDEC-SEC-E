public class CommandLineArgs {
    public static void main(String[] args) {

        // int num1 = Integer.parseInt(args[0]);
        // int num2 = Integer.parseInt(args[1]);
        // int sum = num1 + num2;
        // System.out.println(sum);
        // System.out.println(args[0]);
        // System.out.println(args[1]);



        int sum = 0;
        for(int i = 0; i<args.length;i++){
            sum =  sum + Integer.parseInt(args[i]);
        }
        System.out.println("This is the sum :" +  sum);
    }
}
