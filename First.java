import java.util.Scanner;

public class First
 {
     public static Scanner scanner;
     public static void main(String[] args){
         scanner = new Scanner(System.in);
         int x1,v,t,a,i,u;
         System.out.println("Введите переменные");
         x1 = scanner.nextInt();
         v = scanner.nextInt();
         t = scanner.nextInt();
         i = scanner.nextInt();
         char b;
         b = scanner.next().charAt(0);
         int result= -1 ;
         a = v*t;
         u = i*t*t/2;
         if (b == '+'){
             result = plus(x1,a,u);
         }
         else if (b == '*'){
             result = multiple(x1,a,u);
         }
         else if (b == '-'){
             result = minus (x1,a,u);
         }

         {
             System.out.println(result);
         }


     }

     private static int minus(int x1, int a, int u) {
         return x1 - a - u;
     }

     private static int multiple(int x1, int a, int u) {
         return x1 * a * u;
     }


     private static int plus(int x1, int a, int u) {
         return x1 + a + u;
     }
 }
