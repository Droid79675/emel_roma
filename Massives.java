import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Massives {
    public static void main(String[] args) {
        int a = 20;
        int oops[] = new int[a];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            oops[i] = random.nextInt();
            System.out.println(oops[i]);

        }
        double slurp[] = new double[25];
        for (int i = 0; i < slurp.length; i++) {
            slurp[i] = random.nextDouble();
            System.out.println(slurp[i]);
        }
        double lox [] = new double[8];
        lox = slurp;
        for (int i = 0; i < slurp.length; i++) {
            slurp[i] = random.nextDouble();
            System.out.println(slurp[i]);
        }
        long wow[] = new long[17];
        for (int i = 0; i < wow.length; i++){
            wow[i] = random.nextLong();
            System.out.println(wow[i]);
        }

        boolean nice[] = new boolean[5];
        for (int i = 0; i < nice.length; i++){
            nice[i] = random.nextBoolean();
            System.out.println(nice[i]);
        }
    }
}

