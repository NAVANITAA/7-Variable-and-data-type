public class typecasting {
    public static void main(String args[]) {
        int a = 25;
        float b = a;

        System.out.println(b);

        /*
         * float a = 25;
         * int b = a;
         * 
         * System.out.println(b);
         * 
         * not possible since destination type (here int) is not larger tha source type
         * (here float)
         */
    }
}