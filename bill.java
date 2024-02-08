import java.util.*;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = (float) pen + pencil + eraser;
        System.out.println(bill);

        /*
         * Add on - with 18% tax
         * floatnewTotal=total+ (0.18f*total);
         * System.out.println("Bill with 18% tax : "+newTotal)
         */

        // Add on - with 18% tax
        float newTotal = bill + (0.18f * bill);
        System.out.println("Bill with 18% tax : " + newTotal);
    }
}
